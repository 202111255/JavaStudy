package com.util1;

public class Student {
    private String name;
    private String hakbun;

    public Student(String name, String hakbun) {
        this.name = name;
        this.hakbun = hakbun;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHakbun() {
        return hakbun;
    }

    public void setHakbun(String hakbun) {
        this.hakbun = hakbun;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", hakbun='" + hakbun + '\'' +
                '}';
    }
}
