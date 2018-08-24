package com.yj.futureloan;

import com.yj.util.CaseUtil;
import org.testng.annotations.DataProvider;

public class RechargeCase extends BaseCase{

    @DataProvider(name = "datas")
    public Object[][] datas() {
        Object[][] datas=CaseUtil.datas("3",cellNames);
        return datas;

    }
}
