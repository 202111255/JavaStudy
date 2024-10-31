package com.exam2;


public class InnerEx01 {
    public static void main(String[] args) {

        Outer.Inner inner = new Outer.Inner();
        System.out.println(inner.y2);

        //캡슐화에 대한 접근
        inner.viewInner();
    }
}
