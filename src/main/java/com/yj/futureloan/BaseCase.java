package com.yj.futureloan;

import com.yj.util.ExcelUtil;
import com.yj.util.HttpClientUtil;
import org.testng.Reporter;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.Test;

/**
 * 用例
 */
public class BaseCase {

    @Test(dataProvider = "datas")
    public void testFutureLoan(String caseId,String apiId,String paramsStr){
        String url=HttpClientUtil.getInterfaceUrlByApiId(apiId);
        String type=HttpClientUtil.getInterfaceTypeByApiId(apiId);
        String actualResult=HttpClientUtil.request(url,type,paramsStr);
//        完成接口调用
        Reporter.log(actualResult);
        //单次写入数据
//        ExcelUtil.writeData(ExcelUtil.caseFilePath,"用例",caseId,"ActualResponseData",actualResult);
        //数据保存到List中
        //在套件结束后执行批量写入
        ExcelUtil.saveWriteBackData(caseId,"ActualResponseData",actualResult);
    }

    @AfterSuite
    public  void ending(){
        //批量回写数据
//        ExcelUtil.saveWriteBackData();
        ExcelUtil.batchWriteBackDatas(ExcelUtil.caseFilePath,"用例");
    }
}
