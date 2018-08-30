package com.yj.util;

import java.util.Map;

public class MobilePhoneGenerator {


    /**
     * 返回一个可以注册的手机号
     * toBeRegisterMobilePhone
     * toBeRegisterMobilephone
     * @return phone
     */
    public String toBeRegisterMobilePhone(){
        String sql="select concat(max(mobilephone)+1) as mobilePhone from member";
        Map<String,Object> map=JDBCUtil.query(sql,null);
        String phone=map.get("mobilePhone").toString();
        return phone;
    }

    /**
     * 返回一个还没有注册过的手机号
     * @return
     */
    public String notRegisterYetMobilephone(){
        String sql="select concat(max(mobilephone)+2) as mobilePhone from member";
        Map<String,Object> map=JDBCUtil.query(sql,null);
        String phone=map.get("mobilePhone").toString();
        return phone;
    }
}
