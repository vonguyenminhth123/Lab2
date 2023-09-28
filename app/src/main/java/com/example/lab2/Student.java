package com.example.lab2;

public class Student {
    private String name;
    private int mark;
    private int age;

    public Student(String n, int m, int a) {
        name = n;
        mark = m;
        age = a;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMark() {
        return mark;
    }

    public void setMark(int mark) {
        this.mark = mark;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
