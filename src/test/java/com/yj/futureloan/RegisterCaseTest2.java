package com.yj.futureloan;

import com.yj.util.ExcelUtil;
import org.apache.http.NameValuePair;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class RegisterCaseTest2 {


    @Test(dataProvider = "datas")
    public void test(String url,String type,String phone,String password) {
        if ("post".equalsIgnoreCase(type)){
            HttpPost post=new HttpPost(url);
            try {
                //以表单形式构建参数名-参数值 键值对
                NameValuePair mobilePhonePair=new BasicNameValuePair("mobilephone",phone);
                NameValuePair pwdPair=new BasicNameValuePair("pwd",password);
                List<NameValuePair> params=new ArrayList<NameValuePair>();
                params.add(mobilePhonePair);
                params.add(pwdPair);
                //将参数封装在请求体中
                post.setEntity(new UrlEncodedFormEntity(params,"UTF-8"));
                //创建客户端对象
                CloseableHttpClient httpClient= HttpClients.createDefault();
                CloseableHttpResponse httpResponse=httpClient.execute(post);
                String result=EntityUtils.toString(httpResponse.getEntity());
                System.out.println(result);
            }catch (Exception e){
                e.printStackTrace();
            }
        }else if("get".equalsIgnoreCase(type)){
            url+="?mobilephone="+phone+"?pwd="+password;
            HttpGet get=new HttpGet(url);
            CloseableHttpClient httpClient=HttpClients.createDefault();
            try {
                CloseableHttpResponse httpResponse=httpClient.execute(get);
                String result=EntityUtils.toString(httpResponse.getEntity());
                System.out.println(result);
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }


    @DataProvider(name = "datas")
    public Object[][] datas() {
        String[] cellNames={"Url(接口地址)","Type(接口提交类型)","Mobilephone(手机号)","Pwd(密码)"};
        Object[][] datas = ExcelUtil.readDataByCellNames("src/main/resources/cases_v1.xls","用例",cellNames);
        return datas;
    }
}
