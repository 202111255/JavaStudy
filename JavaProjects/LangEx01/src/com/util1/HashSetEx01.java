package com.util1;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetEx01 {
    public static void main(String[] args) {
        //순서가 없어서 인덱스도 없음
        HashSet<String> hs = new HashSet<>();
        hs.add("홍길동");
        hs.add("박문수");
        hs.add("임꺽정");
        hs.add("박문수");
        hs.add("임꺽정");

        System.out.println(hs);

        System.out.println(hs.size());

        for (String data : hs) {
            System.out.println(data);
        }

        //Iterator
        Iterator<String> it = hs.iterator();
        while(it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
