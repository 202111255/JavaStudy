package com.exam;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class ConsumerEx01 {
    public static void main(String[] args) {
        Consumer<String> c1 = t->System.out.println("매개변수: " + t);
        c1.accept("홍길동");

        BiConsumer<String, Integer> c2 = (a, b)->System.out.println(a + "\t" + b);
        c2.accept("홍길동", 10);


    }
}
