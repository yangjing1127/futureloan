package com.yj.futureloan.cases;

import com.alibaba.fastjson.JSONObject;
import com.yj.futureloan.BaseCase;
import com.yj.util.CaseUtil;
import org.springframework.boot.test.context.SpringBootTest;
import org.testng.annotations.DataProvider;

import java.util.Map;
import java.util.Set;

@SpringBootTest
public class RegisterCase extends BaseCase {

//    @Test(dataProvider = "datas")
//    public void testFutureLoan(String caseId,String apiId,String paramsStr) {
////        System.out.println("用例编号:"+caseId+";参数："+paramsStr);
////        InterfaceInfo interfaceInfo=CaseUtil.getInterfaceByCaseId(caseId);
////        System.out.println(CaseUtil.getInterfaceByCaseId(caseId));
//
//        String url=HttpClientUtil.getInterfaceUrlByApiId(apiId);
//        String type=HttpClientUtil.getInterfaceTypeByApiId(apiId);
//        String actualResult=HttpClientUtil.request(url,type,paramsStr);
//        System.out.println(actualResult);
//    }


    @DataProvider(name = "datas")
    public Object[][] datas() {
//        Object[][] datas = ExcelUtil.readDataByCellNames("src/main/resources/cases_v3.xlsx","用例",cellNames);//效率低
        Object[][] datas=CaseUtil.datas("1",cellNames);
        return datas;
    }

    public static void main(String[] args){
        String json="{\"mobilephone\":\"158\",\"pwd\":\"123123\"}";
        RegisterParam param=JSONObject.parseObject(json,RegisterParam.class);
        System.out.println(param);
        Map<String,String> param2= (Map<String, String>) JSONObject.parse(json);
        Set<Map.Entry<String,String>> entries=param2.entrySet();
        for (Map.Entry<String ,String> entry:entries){
            System.out.println("参数名称"+entry.getKey()+"参数值"+entry.getValue());
        }
//       System.out.println( CaseUtil.getInterfaceByCaseId("1"));
    }
}
