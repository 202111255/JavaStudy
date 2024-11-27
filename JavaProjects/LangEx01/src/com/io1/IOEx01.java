package com.io1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class IOEx01 {
    public static void main(String[] args) {
        //FileInputStream
        FileInputStream fis = null;
        try {
            fis = new FileInputStream("E:/java/change.txt");
            /*int data = fis.read();
            System.out.println((char)data);
            data = fis.read();
            System.out.println((char)data); */
            int data = 0;
            while ((data = fis.read()) != -1) {
                System.out.print((char) data);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                fis.close();
            } catch (IOException e) { };
        }
    }
}
