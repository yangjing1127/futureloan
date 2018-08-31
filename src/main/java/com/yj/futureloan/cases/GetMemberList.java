package com.yj.futureloan.cases;

import com.yj.futureloan.BaseCase;
import com.yj.util.CaseUtil;
import org.testng.annotations.DataProvider;

public class GetMemberList extends BaseCase {

    @DataProvider(name = "datas")
    public Object[][] datas() {
        Object[][] datas=CaseUtil.datas("5",cellNames);
        return datas;
    }
}
