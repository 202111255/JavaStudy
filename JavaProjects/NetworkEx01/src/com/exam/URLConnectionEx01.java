package com.exam;

import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;

public class URLConnectionEx01 {
    public static void main(String[] args) {
        try {
            URL url = new URL("https://m.daum.net");
            URLConnection con = url.openConnection();

            System.out.println(con.getContent());
            System.out.println(con.getContentType());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
