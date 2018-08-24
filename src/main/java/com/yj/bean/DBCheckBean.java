package com.yj.bean;

public class DBCheckBean {
    private String no;
    private String sql;

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }

    public String getSql() {
        return sql;
    }

    public void setSql(String sql) {
        this.sql = sql;
    }

    @Override
    public String toString() {
        return "DBCheckBean{" +
                "no='" + no + '\'' +
                ", sql='" + sql + '\'' +
                '}';
    }
}
