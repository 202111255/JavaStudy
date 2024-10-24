package com.io1;

import java.io.File;

public class FileEx01 {
    public static void main(String[] args) {
        //Directory(특수목적파일) / File
        //경로
        //절대경로 : 드라이브명 부터 추적 E:\Java\JavaProjects
        //상대경로 : 현재 프로그램 위치부터 추적 (현재) /..(부모)

        //경로에 대한 File 객체 생성
        //디렉토리에 대한 파일 경로 생성
        File dir = new File("E:/Java");
        System.out.println(dir);

        //파일에 대한 File 객체 생성
        File file = new File("E:/Java/test.txt");
        System.out.println(file);
        File file2 = new File("E:/Java", "test.txt");
        System.out.println(file2);

        //존재유무
        System.out.println(dir.exists());
        System.out.println(file.exists());
    }
}
