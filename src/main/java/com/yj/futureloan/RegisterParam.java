package com.yj.futureloan;

public class RegisterParam {
    private  String mobilephone;

    private String pwd;

    public String getMobilephone() {
        return mobilephone;
    }

    public String getPwd() {
        return pwd;
    }

    public void setMobilephone(String mobilephone) {
        this.mobilephone = mobilephone;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    @Override
    public String toString() {
        return "RegisterParam{" +
                "mobilephone='" + mobilephone + '\'' +
                ", pwd='" + pwd + '\'' +
                '}';
    }
}
