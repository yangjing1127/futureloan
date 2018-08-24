package com.yj.futureloan;

import com.yj.util.DBCheckUtil;
import com.yj.util.ExcelUtil;
import com.yj.util.HttpClientUtil;
import com.yj.util.JDBCUtil;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.springframework.util.StringUtils;
import org.testng.Reporter;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.Test;

/**
 * 用例
 */

public class BaseCase  {
    String[] cellNames={"CaseId(用例编号)","ApiId(接口编号)","Params(参数)","PreValidateSql(接口执行前的脚本验证)","AfterValidateSql(接口执行后的脚本验证)"};

    @Test(dataProvider = "datas")
    public void testFutureLoan(String caseId,String apiId,String paramsStr,String preValidateSql,String afterValidateSql){

        if(!StringUtils.isEmpty(preValidateSql)){
            //接口调用前的数据写入
            String preValidateResult=DBCheckUtil.validate(preValidateSql);
            //保存要写入的数据
            ExcelUtil.saveWriteBackData(caseId,"PreValidateResult",preValidateResult);
        }
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

        if(!StringUtils.isEmpty(preValidateSql)) {
            //接口调用后的数据写入
            String afterValidateResult = DBCheckUtil.validate(afterValidateSql);
            //保存要写入的数据
            ExcelUtil.saveWriteBackData(caseId, "AfterValidateResult", afterValidateResult);
        }

    }

    @AfterSuite
    public  void ending(){
        //批量回写数据
//        ExcelUtil.saveWriteBackData();
        ExcelUtil.batchWriteBackDatas(ExcelUtil.caseFilePath,"用例");
    }
}
