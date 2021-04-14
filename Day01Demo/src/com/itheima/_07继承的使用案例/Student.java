package com.itheima._07继承的使用案例;

public class Student extends Person {

    public void study() {
        System.out.println(getName() + "在学习");
    }

    public Student() {
    }

    public Student(String name, int age) {
        super(name, age);
    }
}
