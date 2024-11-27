package com.io1;

import java.io.File;
import java.io.IOException;

public class FileEx05 {
    public static void main(String[] args) {
        //디렉토리 생성 / 이름 변경 / 삭제
        //mkdir()
        //renameTo
        //delete
        File dir = new File("E:/Java/dir3");
        File dir2 = new File("E:/Java/dir4");
        //dir.mkdir();
        //dir.renameTo(new File("E:/Java/dir3")); //객체를 만들어서 바꿔야함
        dir.delete();
        dir2.delete();

        File file = new File("E:/Java/test.txt");
        try {
            if(file.exists()) {
                file.renameTo(new File("E:/Java/change.txt"));
            } else {
                file.createNewFile();
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }
}
