package com.util1;
import java.util.StringJoiner;
public class StringJoinerEx01 {
    public static void main(String[] args) {
        //문자열 연결방법
        String str1 = "사과" + "수박" + "딸기" + "참외";
        System.out.println(str1);

        String str2 = "사과".concat("수박").concat("딸기").concat("참외");
        System.out.println(str2);

        String str3 = String.format("%s%s%s%s", "사과", "수박", "딸기", "참외");
        System.out.println(str3);

        String[] arr = {"사과", "수박", "딸기", "참외"};
        String str4 = String.join(",", arr);
        System.out.println(str4);

        StringJoiner joiner = new StringJoiner(", ");
        joiner.add("사과");
        System.out.println(joiner);
    }
}
