//package com.yj.futureloan;
//
//import com.alibaba.fastjson.JSONObject;
//import com.yj.util.ExcelUtil;
//import org.apache.http.NameValuePair;
//import org.apache.http.client.entity.UrlEncodedFormEntity;
//import org.apache.http.client.methods.CloseableHttpResponse;
//import org.apache.http.client.methods.HttpGet;
//import org.apache.http.client.methods.HttpPost;
//import org.apache.http.impl.client.CloseableHttpClient;
//import org.apache.http.impl.client.HttpClients;
//import org.apache.http.message.BasicNameValuePair;
//import org.apache.http.util.EntityUtils;
//import org.testng.annotations.DataProvider;
//import org.testng.annotations.Test;
//
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Map;
//import java.util.Set;
//
//public class RegisterCaseTest3 {
//
//
//
//
//    @Test(dataProvider = "datas")
//    public void test(String url,String type,String paramsStr) {
//        Map<String,String> map=(Map<String,String>)JSONObject.parse(paramsStr);
//        if ("post".equalsIgnoreCase(type)){
//            HttpPost post=new HttpPost(url);
//            try {
//                //以表单形式构建参数名-参数值 键值对
////                RegisterParam param=new RegisterParam();
////                NameValuePair mobilePhonePair=new BasicNameValuePair("mobilephone",param.getMobilephone());
////                NameValuePair pwdPair=new BasicNameValuePair("pwd",param.getPwd());
//                NameValuePair mobilePhonePair=new BasicNameValuePair("mobilephone",map.get("mobilephone"));
//                NameValuePair pwdPair=new BasicNameValuePair("pwd",map.get("pwd"));
//                List<NameValuePair> params=new ArrayList<NameValuePair>();
//                params.add(mobilePhonePair);
//                params.add(pwdPair);
//                //将参数封装在请求体中
//                post.setEntity(new UrlEncodedFormEntity(params,"UTF-8"));
//                //创建客户端对象
//                CloseableHttpClient httpClient= HttpClients.createDefault();
//                CloseableHttpResponse httpResponse=httpClient.execute(post);
//                String result=EntityUtils.toString(httpResponse.getEntity());
//                System.out.println(result);
//            }catch (Exception e){
//                e.printStackTrace();
//            }
//        }else if("get".equalsIgnoreCase(type)){
//            url+="?mobilephone="+map.get("mobilephone")+"?pwd="+map.get("mobilephone");
//            HttpGet get=new HttpGet(url);
//            CloseableHttpClient httpClient=HttpClients.createDefault();
//            try {
//                CloseableHttpResponse httpResponse=httpClient.execute(get);
//                String result=EntityUtils.toString(httpResponse.getEntity());
//                System.out.println(result);
//            }catch (Exception e){
//                e.printStackTrace();
//            }
//        }
//    }
//    @DataProvider(name = "datas")
//    public Object[][] datas() {
//        String[] cellNames={"Url(接口地址)","Type(接口提交类型)","Params(参数)"};
//        Object[][] datas = ExcelUtil.readDataByCellNames("src/main/resources/cases_v2.xls","用例",cellNames);
//        return datas;
//    }
//
//    public static void main(String[] args){
//        String json="{\"mobilephone\":\"158\",\"pwd\":\"123123\"}";
//        RegisterParam param=JSONObject.parseObject(json,RegisterParam.class);
//        System.out.println(param);
//
//        Map<String,String> param2= (Map<String, String>) JSONObject.parse(json);
//        Set<Map.Entry<String,String>> entries=param2.entrySet();
//        for (Map.Entry<String ,String> entry:entries){
//            System.out.println("參數名稱"+entry.getKey()+"參數值"+entry.getValue());
//        }
//    }
//}
