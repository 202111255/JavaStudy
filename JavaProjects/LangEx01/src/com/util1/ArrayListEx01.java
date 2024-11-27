package com.util1;

import java.util.ArrayList;
import java.util.List;

public class ArrayListEx01 {
    public static void main(String[] args) {
        ArrayList ar1 = new ArrayList();
        ArrayList ar2 = new ArrayList(100);

        List list = new ArrayList();

        ar1.add("홍길동");
        String str = "박문수";
        Object obj = str;
        ar1.add(obj);
        ar1.add("임꺽정");
        //가장 중요한 것 object가 들어간다.

        System.out.println(ar1.size());
        System.out.println(ar1);


        Object obj1 = ar1.get(0);
        String str1 = (String)obj1;
        System.out.println(str1);


    }
}
