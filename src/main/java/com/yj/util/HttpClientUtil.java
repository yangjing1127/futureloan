package com.yj.util;

import com.alibaba.fastjson.JSONObject;
import org.apache.http.Header;
import org.apache.http.HttpRequest;
import org.apache.http.NameValuePair;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.utils.URLEncodedUtils;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HttpClientUtil {

    public static ArrayList<InterfaceInfo> rests=new ArrayList<InterfaceInfo>();

    static {
        ExcelUtil.loadDatas(ExcelUtil.caseFilePath,"接口信息",InterfaceInfo.class);
    }

    public static Map<String,String> authorizeInfoMap =new HashMap<String, String>();
    public static void main(String[] args){
        for(InterfaceInfo info:rests){
            System.out.println(info);
        }
    }

    public static String request(String url, String requestType, String paramsStr) {
        String result=null;
            Map<String, String> map = (Map<String, String>) JSONObject.parse(paramsStr);
            if ("post".equalsIgnoreCase(requestType)) {
                result= doPost(url, map);
            } else if ("get".equalsIgnoreCase(requestType)) {
               result= doGet(url, map);
            }
            return result;
    }

    private static String doGet(String url, Map<String, String> map) {
        List<NameValuePair> params = new ArrayList<NameValuePair>();
        for (Map.Entry<String,String> entry: map.entrySet()){
            NameValuePair pair=new BasicNameValuePair(entry.getKey(),entry.getValue());
            params.add(pair);
        }
//        url += "?mobilephone=" + map.get("mobilephone") + "?pwd=" + map.get("mobilephone");
        url+="?"+URLEncodedUtils.format(params,"UTF-8");
        HttpGet get = new HttpGet(url);
        String result=null;
        CloseableHttpClient httpClient = HttpClients.createDefault();
        try {
            CloseableHttpResponse httpResponse = httpClient.execute(get);
            result = EntityUtils.toString(httpResponse.getEntity());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

    private static String doPost(String url, Map<String, String> map) {
        HttpPost post = new HttpPost(url);
        String result=null;
        try {
//            以表单形式构建参数名-参数值 键值对
//                RegisterParam param=new RegisterParam();
//                NameValuePair mobilePhonePair=new BasicNameValuePair("mobilephone",param.getMobilephone());
//                NameValuePair pwdPair=new BasicNameValuePair("pwd",param.getPwd());
//            NameValuePair mobilePhonePair = new BasicNameValuePair("mobilephone", map.get("mobilephone"));
//            NameValuePair pwdPair = new BasicNameValuePair("pwd", map.get("pwd"));
            //循环取出表单值，封装到params参数列表中
            List<NameValuePair> params = new ArrayList<NameValuePair>();
            for (Map.Entry<String,String> entry: map.entrySet()){
                NameValuePair pair=new BasicNameValuePair(entry.getKey(),entry.getValue());
                params.add(pair);
            }
            //将参数封装在请求体中
            post.setEntity(new UrlEncodedFormEntity(params, "UTF-8"));
            //创建客户端对象
            CloseableHttpClient httpClient = HttpClients.createDefault();
            // 获取jsessionId
            addAuthorizeInfo(post);
            CloseableHttpResponse httpResponse = httpClient.execute(post);
            // 保存login获取到的set-Cookie到jsessionId
            getAuthorizeAndSave(httpResponse);
            httpResponse.getAllHeaders();
            result = EntityUtils.toString(httpResponse.getEntity());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

    /**
     * 为post请求增加鉴权头信息
     * @param post
     */
    private static void addAuthorizeInfo(HttpRequest post) {
        String value=authorizeInfoMap.get("jsessionId");
        if (value!=null&&value.trim().length()>0){
         post.addHeader("Cookie",value);
        }
    }

    /**
     * 从Login接口中获取鉴权头信息，并保存到Map中
     * @param httpResponse
     */
    private static void getAuthorizeAndSave(CloseableHttpResponse httpResponse) {
        Header header=httpResponse.getFirstHeader("Set-Cookie");
        if (header!=null){
            String value=header.getValue();
            int index=value.indexOf("JSESSIONID");
            if (value != null && index!=-1) {
               String authorizeInfo= value.substring(index,value.indexOf(";"));
                authorizeInfoMap.put("jsessionId",authorizeInfo);
            }
        }
    }


    public static String getInterfaceUrlByApiId(String apiId) {
        for (InterfaceInfo info:rests){
            if (info.getApiId().equals(apiId)){
                return info.getUrl();
            }
        }
        return null;
    }

    public static String getInterfaceTypeByApiId(String apiId) {
        for (InterfaceInfo info:rests){
            if (info.getApiId().equals(apiId)){
                return info.getType();
            }
        }
        return null;
    }

    public static String getInterfaceNameByApiId(String apiId) {
        for (InterfaceInfo info:rests){
            if (info.getApiId().equals(apiId)){
                return info.getApiName();
            }
        }
        return null;
    }


}
