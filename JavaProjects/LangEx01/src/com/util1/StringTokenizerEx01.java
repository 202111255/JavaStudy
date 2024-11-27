package com.util1;

import java.util.StringTokenizer;

public class StringTokenizerEx01 {
    public static void main(String[] args) {
        String strData1 = "사과 참외 수박 딸기";
        StringTokenizer st = new StringTokenizer(strData1);
        System.out.println(st.countTokens());

        while(st.hasMoreTokens()) {
            System.out.println(st.nextToken());
        }

        String strData2 = "사과&참외&수박&딸기";
        StringTokenizer st2 = new StringTokenizer(strData2, "&");
        while(st2.hasMoreTokens()) {
            System.out.println(st2.nextToken());
        }
    }
}
