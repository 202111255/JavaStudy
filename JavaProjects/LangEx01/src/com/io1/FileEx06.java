package com.io1;

import java.io.File;
import java.io.IOException;

public class FileEx06 {
    public static void main(String[] args) {

        File file = new File("E:/Java/newtest.txt");
        try {
            if (!file.exists()) {
                file.createNewFile();
            } else {
                file.renameTo(new File("E:/Java/newest2.text"));
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
