package com.io1;

import java.io.File;
import java.io.IOException;

public class FileEx02 {
    public static void main(String[] args) {
        //디렉토리
        File file = new File("E:/Java/dir2");
        //디렉토리 생성
        file.mkdir();
        //디렉토리인지 / 파일인지 구분
        System.out.println(file.isDirectory());
        System.out.println(file.isFile());
        //System.out.println(file.isHidden());

        //경로
        System.out.println(file.getName());
        System.out.println(file.getParent());
        System.out.println(file.getPath());
        try {
            System.out.println(file.getCanonicalPath());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
