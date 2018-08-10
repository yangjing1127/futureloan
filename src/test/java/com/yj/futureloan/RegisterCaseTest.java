package com.yj.futureloan;

import org.apache.http.NameValuePair;
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

public class RegisterCaseTest {

    @org.testng.annotations.BeforeMethod
    public void setUp() {
    }

    @org.testng.annotations.AfterMethod
    public void tearDown() {
    }

    @Test(dataProvider = "datas")
    public void testRegister(String url,String type,String phone,String password) {

        requestRegister(url, type, phone, password);

    }

    public static void requestRegister(String url, String type, String phone, String password) {
        if ("post".equalsIgnoreCase(type)){
            HttpPost post=new HttpPost(url);
            try {
                //以表单形式构建参数名-参数值 键值对
                NameValuePair mobilePhonePair=new BasicNameValuePair("mobilePhone",phone);
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
        String[][] datas = {
                //{"http://119.23.241.154:8080/futureloan/mvc/api/member/login","type","param","result","expectResult"},
                {"http://119.23.241.154:8080/futureloan/mvc/api/member/login","post","15868821400",""},
                {"http://119.23.241.154:8080/futureloan/mvc/api/member/login","post","","123456"},
                {"http://119.23.241.154:8080/futureloan/mvc/api/member/login","post","158","123456"},
                {"http://119.23.241.154:8080/futureloan/mvc/api/member/login","post","15868821400","123"},
                {"http://119.23.241.154:8080/futureloan/mvc/api/member/login","post","15868821400","123456"},
                {"http://119.23.241.154:8080/futureloan/mvc/api/member/login","post","15868821400","123456"},
        };
        return datas;
    }
}