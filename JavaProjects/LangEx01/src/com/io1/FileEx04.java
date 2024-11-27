package com.io1;

import java.io.File;

public class FileEx04 {
    public static void main(String[] args) {
        File dir = new File("E:/Java");

        String[] files = dir.list();
        for (String file : files) {
            System.out.println(file);
        }
    }
}
