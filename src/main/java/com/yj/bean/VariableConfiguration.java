package com.yj.bean;

/**
 * 变量配置类
 */
public class VariableConfiguration {

    private String remarks;
    private String name;
    private String value;
    private String reflectClass;
    private String reflectMethod;

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getReflectClass() {
        return reflectClass;
    }

    public void setReflectClass(String reflectClass) {
        this.reflectClass = reflectClass;
    }

    public String getReflectMethod() {
        return reflectMethod;
    }

    public void setReflectMethod(String reflectMethod) {
        this.reflectMethod = reflectMethod;
    }

    @Override
    public String toString() {
        return "VariableConfiguration{" +
                "remarks='" + remarks + '\'' +
                ", name='" + name + '\'' +
                ", value='" + value + '\'' +
                ", reflectClass='" + reflectClass + '\'' +
                ", reflectMethod='" + reflectMethod + '\'' +
                '}';
    }
}
