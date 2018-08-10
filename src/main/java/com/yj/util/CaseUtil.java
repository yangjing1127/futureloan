package com.yj.util;

import java.util.HashMap;
import java.util.Map;
import java.util.zip.Inflater;

/**
 * 用于管理接口信息
 */
public class CaseUtil {

    public static Object[][] getInterfaceInfo(String filePath,String sheetName,String[] cellNames){
        Object[][] datas = ExcelUtil.readDataByCellNames(filePath,sheetName,cellNames);
        return datas;
    }
    public static void main(String[] args){
        String[] cellNames={"ApiId(接口编号)","ApiName(接口名称)","Type(接口提交方式)","Url(接口地址)"};
        Object[][] datas=CaseUtil.getInterfaceInfo("src/main/resources/cases_v3.xlsx","接口信息",cellNames);
        for (int i = 0; i < datas.length; i++) {
            for (int j = 0; j < datas[i].length; j++) {
                System.out.print(datas[i][j]);
            }
            System.out.println();
        }
    }

    /**
     * 根据用例编号获取接口基本信息
     * @param caseId
     * @return
     */
    public static InterfaceInfo getInterfaceByCaseId(String caseId) {
        InterfaceInfo interfaceInfo=new InterfaceInfo();

        String apiId=getApiIdByCaseId(caseId);
        String interfaceName=getInterfaceNameByApiId(apiId);
        String interfaceType=getInterfaceTypeByApiId(apiId);
        String interfaceUrl=getInterfaceUrlByApiId(apiId);

        interfaceInfo.setInterfaceNo(apiId);
        interfaceInfo.setInterfaceName(interfaceName);
        interfaceInfo.setRequestType(interfaceType);
        interfaceInfo.setUrl(interfaceUrl);
        return interfaceInfo;
    }

    private static String getInterfaceUrlByApiId(String apiId) {
        String interfaceUrl ="";
        String[] cellNames={"ApiId(接口编号)","Url(接口地址)"};
        Object[][] datas=ExcelUtil.readDataByCellNames("src/main/resources/cases_v3.xlsx","接口信息",cellNames);
        for (int i = 0; i < datas.length; i++) {
            if(apiId.equalsIgnoreCase((String) datas[i][0])){
                interfaceUrl=(String) datas[i][1];
            }
        }
        return interfaceUrl;
    }

    private static String getInterfaceTypeByApiId(String apiId) {
        String interfaceType ="";
        String[] cellNames={"ApiId(接口编号)","Type(接口提交方式)"};
        Object[][] datas=ExcelUtil.readDataByCellNames("src/main/resources/cases_v3.xlsx","接口信息",cellNames);
        for (int i = 0; i < datas.length; i++) {
            if(apiId.equalsIgnoreCase((String) datas[i][0])){
                interfaceType=(String) datas[i][1];
            }
        }
        return interfaceType;
    }

    private static String getInterfaceNameByApiId(String apiId) {
        String interfaceName ="";
        String[] cellNames={"ApiId(接口编号)","ApiName(接口名称)"};
        Object[][] datas=ExcelUtil.readDataByCellNames("src/main/resources/cases_v3.xlsx","接口信息",cellNames);
        for (int i = 0; i < datas.length; i++) {
            if(apiId.equalsIgnoreCase((String) datas[i][0])){
                interfaceName=(String) datas[i][1];
            }
        }
        return interfaceName;
    }

    private static String getApiIdByCaseId(String caseId) {
        String apiId ="";
        String[] cellNames={"CaseId(用例编号)","ApiId(接口编号)"};
        Object[][] datas=ExcelUtil.readDataByCellNames("src/main/resources/cases_v3.xlsx","用例",cellNames);
        for (int i = 0; i < datas.length; i++) {
            if(caseId.equalsIgnoreCase((String) datas[i][0])){
                apiId=(String) datas[i][1];
            }
        }
        return apiId;
    }
}
