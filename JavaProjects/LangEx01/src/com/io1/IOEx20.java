package com.io1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class IOEx20 {
    public static void main(String[] args) {
        BufferedReader br = null;

        try {
            br = new BufferedReader(new InputStreamReader(System.in));

            // 무한 반복 입력 처리
            while (true) {
                System.out.print("입력 (종료하려면 'exit' 입력): ");

                // 사용자 입력 받기
                String line = br.readLine();

                // 'exit' 입력 시 프로그램 종료
                if ("exit".equalsIgnoreCase(line)) {
                    System.out.println("입력을 종료합니다.");
                    break;
                }

                // 입력값 출력
                System.out.println("입력값: " + line);
            }

        } catch (IOException e) {
            System.out.println("[에러] " + e.getMessage());
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    System.out.println("[에러] BufferedReader 종료 중 에러 발생: " + e.getMessage());
                }
            }
        }
    }
}