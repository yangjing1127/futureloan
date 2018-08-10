package com.yj.util;

public class InterfaceInfo {

    private String url;
    private String interfaceName;
    private String interfaceNo;
    private String requestType;//post-get

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getInterfaceName() {
        return interfaceName;
    }

    public void setInterfaceName(String interfaceName) {
        this.interfaceName = interfaceName;
    }

    public String getInterfaceNo() {
        return interfaceNo;
    }

    public void setInterfaceNo(String interfaceNo) {
        this.interfaceNo = interfaceNo;
    }

    public String getRequestType() {
        return requestType;
    }

    public void setRequestType(String requestType) {
        this.requestType = requestType;
    }

    @Override
    public String toString() {
        return "InterfaceInfo{" +
                "url='" + url + '\'' +
                ", interfaceName='" + interfaceName + '\'' +
                ", interfaceNo='" + interfaceNo + '\'' +
                ", requestType='" + requestType + '\'' +
                '}';
    }
}
