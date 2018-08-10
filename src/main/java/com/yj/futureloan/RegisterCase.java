package com.yj.futureloan;

import com.alibaba.fastjson.JSONObject;
import com.yj.util.CaseUtil;
import com.yj.util.ExcelUtil;
import com.yj.util.HttpClientUtil;
import com.yj.util.InterfaceInfo;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.Map;
import java.util.Set;

public class RegisterCase {

    @Test(dataProvider = "datas")
    public void testFutureLoan(String caseId,String paramsStr) {
        System.out.println("用例编号:"+caseId+";参数："+paramsStr);
        InterfaceInfo interfaceInfo=CaseUtil.getInterfaceByCaseId(caseId);
        System.out.println(CaseUtil.getInterfaceByCaseId(caseId));

        String actualResult=HttpClientUtil.request(interfaceInfo.getUrl(),interfaceInfo.getRequestType(),paramsStr);

    }


    @DataProvider(name = "datas")
    public Object[][] datas() {
        String[] cellNames={"CaseId(用例编号)","Params(参数)"};
        Object[][] datas = ExcelUtil.readDataByCellNames("src/main/resources/cases_v3.xlsx","用例",cellNames);
        return datas;
    }

    public static void main(String[] args){
        String json="{\"mobilephone\":\"158\",\"pwd\":\"123123\"}";
        RegisterParam param=JSONObject.parseObject(json,RegisterParam.class);
        System.out.println(param);
        
        Map<String,String> param2= (Map<String, String>) JSONObject.parse(json);
        Set<Map.Entry<String,String>> entries=param2.entrySet();
        for (Map.Entry<String ,String> entry:entries){
            System.out.println("參數名稱"+entry.getKey()+"參數值"+entry.getValue());
        }
       System.out.println( CaseUtil.getInterfaceByCaseId("1"));
    }
}
