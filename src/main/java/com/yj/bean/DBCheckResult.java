package com.yj.bean;

import java.util.Map;

public class DBCheckResult {
    private String no;

    private Map<String,Object> columnLablesAndValues;

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }

    public Map<String, Object> getColumnLablesAndValues() {
        return columnLablesAndValues;
    }

    public void setColumnLablesAndValues(Map<String, Object> columnLablesAndValues) {
        this.columnLablesAndValues = columnLablesAndValues;
    }

    @Override
    public String toString() {
        return "DBCheckResult{" +
                "no='" + no + '\'' +
                ", columnLablesAndValues=" + columnLablesAndValues +
                '}';
    }
}
