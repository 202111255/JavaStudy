package com.io1;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class IOEx02 {
    public static void main(String[] args) {
        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream("E:/Java/testOP.txt");
            fos.write('a');
            fos.write('b');
            System.out.println("출력 완료");
        } catch (FileNotFoundException e) {
            System.out.println("[에러] " + e.getMessage());
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {fos.close();} catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
