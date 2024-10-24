package com.io1;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class IOEx17 {
    public static void main(String[] args) {
        //Map
        //Properties(시스템의 환경)
        //저장 기능 - FileWriter

        Properties prop = new Properties();
        prop.setProperty("id", "andy");
        prop.setProperty("password", "1234");
        prop.setProperty("grade", "A");

        System.out.println(prop);

        FileWriter fw = null;
        try {
            fw = new FileWriter("./config.properties");
            prop.store(fw, "System Config");
            System.out.println("저장 완료");
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            if (fw != null) {
                try {fw.close();} catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }

    }
}
