package com.util1;

import java.util.ArrayList;

public class ArrayListEx03 {
    public static void main(String[] args) {
        ArrayList al = new ArrayList();

        al.add("A");
        al.add("B");
        al.add(10);
        al.add(20);
        al.add('a');
        al.add('b');

        for (Object obj : al) {
            System.out.println(obj);
        }

        ArrayList<String> al2 = new ArrayList<>();

    }






}
