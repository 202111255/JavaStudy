package com.util1;

import java.util.ArrayList;

public class ArrayListEx04 {
    public static void main(String[] args) {
        Student s1 = new Student("강바다", "202111255");

        ArrayList<Student> al = new ArrayList<>();
        al.add(s1);
        System.out.println(al);
    }
}
