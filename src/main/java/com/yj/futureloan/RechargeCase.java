package com.yj.futureloan;

import com.yj.util.CaseUtil;
import org.testng.annotations.DataProvider;

public class RechargeCase extends BaseCase{

    @DataProvider(name = "datas")
    public Object[][] datas() {
        String[] cellNames={"CaseId(用例编号)","ApiId(接口编号)","Params(参数)"};
        Object[][] datas=CaseUtil.datas("3",cellNames);
        return datas;

    }
}
