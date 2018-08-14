package com.yj.util;

import com.yj.bean.Case;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/**
 * 用于管理接口信息
 */
public class CaseUtil {

    public static List<Case> cases =new ArrayList<Case>();

    static {
        ExcelUtil.loadDatas(ExcelUtil.caseFilePath,"用例",Case.class);
    }


    public static Object[][] datas(String apiId,String[] cellNames){
        //根据apiId 筛选出对应数据
        List<Case> satisfied=new ArrayList<Case>();
        for (Case cs:cases){
            if(cs.getApiId().equals(apiId)){
                satisfied.add(cs);
            }
        }
        Object[][] datas=new Object[satisfied.size()][cellNames.length];
        Class clazz=Case.class;
        for (int i=0;i<satisfied.size();i++)
        {
            //eg.cellNames={"caseId","apiId","params"}
            Case cs=satisfied.get(i);
            for (int j = 0; j < cellNames.length; j++) {
                String cellName=cellNames[j];
                String methodName="get"+cellName.substring(0,cellName.indexOf("("));
                Method method= null;
                String value=null;
                try {
                    method = clazz.getMethod(
                            methodName
                    );
                   value =(String)method.invoke(cs);
                } catch (NoSuchMethodException e) {
                    e.printStackTrace();
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                } catch (InvocationTargetException e) {
                    e.printStackTrace();
                }
                datas[i][j]=value;
            }
        }
        return  datas;
    }

    public static Object[][] getInterfaceInfo(String filePath,String sheetName,String[] cellNames){
        Object[][] datas = ExcelUtil.readDataByCellNames(filePath,sheetName,cellNames);
        return datas;
    }
    public static void main1(String[] args){
        String[] cellNames={"ApiId(接口编号)","ApiName(接口名称)","Type(接口提交方式)","Url(接口地址)"};
        Object[][] datas=CaseUtil.getInterfaceInfo(ExcelUtil.caseFilePath,"接口信息",cellNames);
        for (int i = 0; i < datas.length; i++) {
            for (int j = 0; j < datas[i].length; j++) {
                System.out.print(datas[i][j]);
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        for (Case aCase:cases){
            System.out.println(aCase);
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

        interfaceInfo.setApiId(apiId);
        interfaceInfo.setApiName(interfaceName);
        interfaceInfo.setType(interfaceType);
        interfaceInfo.setUrl(interfaceUrl);
        return interfaceInfo;
    }

    @Deprecated
    private static String getInterfaceUrlByApiId(String apiId) {
        String interfaceUrl ="";
        String[] cellNames={"ApiId(接口编号)","Url(接口地址)"};
        Object[][] datas=ExcelUtil.readDataByCellNames(ExcelUtil.caseFilePath,"接口信息",cellNames);
        for (int i = 0; i < datas.length; i++) {
            if(apiId.equalsIgnoreCase((String) datas[i][0])){
                interfaceUrl=(String) datas[i][1];
            }
        }
        return interfaceUrl;
    }

    @Deprecated
    private static String getInterfaceTypeByApiId(String apiId) {
        String interfaceType ="";
        String[] cellNames={"ApiId(接口编号)","Type(接口提交方式)"};
        Object[][] datas=ExcelUtil.readDataByCellNames(ExcelUtil.caseFilePath,"接口信息",cellNames);
        for (int i = 0; i < datas.length; i++) {
            if(apiId.equalsIgnoreCase((String) datas[i][0])){
                interfaceType=(String) datas[i][1];
            }
        }
        return interfaceType;
    }

    @Deprecated
    private static String getInterfaceNameByApiId(String apiId) {
        String interfaceName ="";
        String[] cellNames={"ApiId(接口编号)","ApiName(接口名称)"};
        Object[][] datas=ExcelUtil.readDataByCellNames(ExcelUtil.caseFilePath,"接口信息",cellNames);
        for (int i = 0; i < datas.length; i++) {
            if(apiId.equalsIgnoreCase((String) datas[i][0])){
                interfaceName=(String) datas[i][1];
            }
        }
        return interfaceName;
}

    @Deprecated
    private static String getApiIdByCaseId(String caseId) {
        String apiId ="";
        String[] cellNames={"CaseId(用例编号)","ApiId(接口编号)"};
        Object[][] datas=ExcelUtil.readDataByCellNames(ExcelUtil.caseFilePath,"用例",cellNames);
        for (int i = 0; i < datas.length; i++) {
            if(caseId.equalsIgnoreCase((String) datas[i][0])){
                apiId=(String) datas[i][1];
            }
        }
        return apiId;
    }
}
