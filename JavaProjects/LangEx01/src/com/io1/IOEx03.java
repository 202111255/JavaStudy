package com.io1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class IOEx03 {
    public static void main(String[] args) {
        //파일 내용을 복사
        FileInputStream fis = null;
        FileOutputStream fos = null;

        try {
            fis = new FileInputStream("E:/Java/change.txt");
            fos = new FileOutputStream("E:/Java/newtest.txt");

            int data = 0;
            while ((data = fis.read()) != -1) {
                fos.write(data);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println("복사완료");
    }
}
