package com.io1;

import java.io.File;
import java.util.Date;

public class FileEx03 {
    public static void main(String[] args) {
        File file = new File("E:/Java/data.pdf");
        long fileSize = file.length(); //byte
        //byte -> Kbyte
        System.out.println(fileSize/1024);

        //수정날짜 확인
        long fileDate = file.lastModified();
        System.out.println(fileDate);
        System.out.println(new Date(fileDate).toLocaleString());
    }
}
