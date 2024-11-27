package com.util1;

import java.util.Scanner;

public class ScannerEx01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); //System.in : 표준입력 = 키보드
        //입력을 위한 prompt
        System.out.print("입력: ");
        String msg = sc.next();

        System.out.println("입력: " + msg);
    }
}
