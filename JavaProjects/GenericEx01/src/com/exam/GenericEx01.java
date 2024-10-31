package com.exam;

import java.util.ArrayList;
import java.util.List;

public class GenericEx01 {
    public static void main(String[] args) {
        //비제네릭 코드
        List list = new ArrayList<>();
        list.add("A");
        list.add(1);
        list.add(Integer.valueOf(2));
        //컴파일시 자료형 규정이 안된다.

        // -- 제네릭
        List<String> list2 = new ArrayList<>();
        list2.add("A");
        list2.add("A");
        //list2.add(1); -1. 컴파일 시 타입 체크
        //2. 리스트에서 값을 가져올 때 형변환을 해주지 않아도 된다.
        //형의 안정성을 위해 제네릭을 사용한다.
    }
}
