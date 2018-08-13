package com.yj.util;

public class InterfaceInfo {

    private String url;
    private String apiName;
    private String apiId;
    private String type;//post-get

    @Override
    public String toString() {
        return "InterfaceInfo{" +
                "url='" + url + '\'' +
                ", apiName='" + apiName + '\'' +
                ", apiId='" + apiId + '\'' +
                ", type='" + type + '\'' +
                '}';
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getApiName() {
        return apiName;
    }

    public void setApiName(String apiName) {
        this.apiName = apiName;
    }

    public String getApiId() {
        return apiId;
    }

    public void setApiId(String apiId) {
        this.apiId = apiId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
