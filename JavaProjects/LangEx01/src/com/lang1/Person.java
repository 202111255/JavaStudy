package com.lang1;

import java.util.Objects;

//묵시적 Object 상속
public class Person /*extends Object*/ {
    private int id;
    private String name;
    private int age;

    public Person(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public String viewData() {
        return "ID: " + id + "\nName: " + name + "\nAge: " + age;
    }

//    @Override
//    public String toString() {
//        return "Hello Person";
//    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    /*@Override
    public boolean equals(Object obj) {
        boolean result = false;
        Person p = (Person) obj;
        //내용비교 흐름
        if(p.id == this.id && p.name.equals(this.name) && p.age == this.age) {
            result = true;
        }
        return result;
    } */

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return id == person.id && age == person.age && Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, age);
    }
}
