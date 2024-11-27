package com.exam;

import java.net.MalformedURLException;
import java.net.URL;

public class URLEx01 {
    public static void main(String[] args) {
        //URL(Uniform Resource Location)
        //브라우저 표현
        //문자열 => 각 요소별로 필드 저장

        String strUrl = "http://www.codechobo.com/sample/hello.html?referer=codechobo#index1";
        try {
            URL url = new URL(strUrl);
            System.out.println(url.getProtocol());
            System.out.println(url.getHost());

        } catch (MalformedURLException e) {
            System.out.println(e.getMessage());
        }

    }
}
