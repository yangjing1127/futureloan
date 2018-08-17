package com.yj.util;

import org.testng.annotations.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

public class PropertiesUtil {
    public static String caseConfigPath = "src/main/resources/config/caseConfig.properties";


    public  static String getCaseFile() {
        String caseFile = "";
        try {
            Properties properties = new Properties();
            InputStream inputStream = new FileInputStream(
                    new File(caseConfigPath)
            );
            properties.load(inputStream);
            caseFile = properties.getProperty("caseFile");
            System.out.println(caseFile);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return caseFile;
    }

    public static void main(String[] args){
        PropertiesUtil.getCaseFile();
    }
}
