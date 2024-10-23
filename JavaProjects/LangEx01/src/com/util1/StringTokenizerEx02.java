package com.util1;

import java.util.StringTokenizer;

public class StringTokenizerEx02 {
    public static void main(String[] args) {
        String strData = "사과&참외&&수박&&&딸기";
        StringTokenizer st = new StringTokenizer(strData, "&");
        System.out.println(st.countTokens());
        while(st.hasMoreTokens()) {
            System.out.println(st.nextToken());
        }
    }
}
