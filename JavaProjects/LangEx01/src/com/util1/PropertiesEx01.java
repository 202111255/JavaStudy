package com.util1;
import java.util.Collection;
import java.util.Properties;

public class PropertiesEx01 {
    public static void main(String[] args) {
        //시스템 환경값
        Properties prop = new Properties();
        prop.setProperty("timeout", "30");
        prop.setProperty("language", "kr");
        prop.setProperty("size", "10");
        prop.setProperty("capacity", "10");

        System.out.println(prop);

    }
}
