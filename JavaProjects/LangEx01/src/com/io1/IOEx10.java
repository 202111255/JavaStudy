package com.io1;

import java.io.FileWriter;
import java.io.IOException;

public class IOEx10 {
    public static void main(String[] args) {
        FileWriter fw = null;
        try {
            fw = new FileWriter("./test.txt");
            fw.write("Hello");
            fw.write(System.lineSeparator());
            fw.write("Hello");

            System.out.println("출력완료");
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            if (fw != null) {
                try {fw.close();}
                catch (IOException e) {}
            }
        }
    }
}
