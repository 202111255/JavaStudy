package com.exam;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;

public class URLEx04 {
    public static void main(String[] args) {
        //웹 사이트(웹서버)에서 html 데이터를 읽어오는 프로그램
        BufferedReader br = null;

        try {
            URL url = new URL("https://news.daum.net/");//URL 클래스 만들기
            br = new BufferedReader(new InputStreamReader(url.openStream()));

            /*int data = 0;
            while( (data = br.read()) != -1 ) {
                System.out.print((char)data);
            }*/
            String line = null;

            Boolean flag = false;
            while ((line = br.readLine()) != null) {
                //System.out.println(line);
                if (line.contains("<ul class=\"list_newsissue\">")) {
                    flag = true;
                    continue;
                }
                if (line.contains("</ul>")) {
                    flag = false;
                }
            }

        } catch (IOException e) {
            System.out.println("[에러]: " + e.getMessage());
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                }
            }
        }
    }
}
