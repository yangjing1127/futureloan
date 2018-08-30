package com.yj.util;

import com.yj.bean.VariableConfiguration;

import java.lang.reflect.Method;
import java.util.*;

/**
 * 变量处理工具类
 */
public class VariableConfigurationUtil {

    public static List<VariableConfiguration> configurationList=new ArrayList<VariableConfiguration>();

    public static Map<String,String> paramAndValueMap=new HashMap<String,String>();

    static {
        ExcelUtil.loadDatas(PropertiesUtil.getCaseFile(),"变量",VariableConfiguration.class);
        loadParamAndValueMap();
    }

    private static void loadParamAndValueMap() {
        for (VariableConfiguration bean : configurationList) {

            String name = bean.getName();
            String value = bean.getValue();
            if (value == null || value.trim().length() == 0) {
                //通过反射获取变量值放入Map
                String className = bean.getReflectClass();
                String methodName = bean.getReflectMethod();
                try {
                    Class clazz = Class.forName(className);
                    Object obj=clazz.newInstance();
                    //要反射的方法，再设计的时候不需要入参，所以这里不需要传参数类型
                    Method method = clazz.getMethod(methodName);
                    value = (String) method.invoke(obj);
                    paramAndValueMap.put(name, value);
                    System.out.println("参数名=【"+name+"】，参数值=【"+value+"】");
                } catch (Exception e) {
                    e.printStackTrace();
                }

            } else {
                //配置了参数值
                paramAndValueMap.put(name, value);
                System.out.println("参数名=【"+name+"】，参数值=【"+value+"】");
            }
        }
    }

    public static void main(String[] args){
        for (VariableConfiguration bean:configurationList){
            System.out.println(bean);
        }

        for (Map.Entry<String, String> entry : paramAndValueMap.entrySet()){
            System.out.print("参数名："+entry.getKey());
            System.out.print("参数值："+entry.getValue());
            System.out.println();
        }
    }

    /**
     * excel中参数包含变量参数名时，替换为值
     * @param paramsStr
     * @return
     */
    public static String replaceParam(String paramsStr) {
        Set<String> variables=paramAndValueMap.keySet();
        for (String variableName:variables){

            if(paramsStr.contains(variableName)){
                paramsStr= paramsStr.replace(variableName,paramAndValueMap.get(variableName));
            }
        }
        return paramsStr;
    }
}
