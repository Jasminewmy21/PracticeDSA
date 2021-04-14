package com.itheima01;
/*
    JavaBean类：类似这种封装数据的类
 */
public class Student {
    /*
        属性
        成员变量
     */
    private String name;
    private int age;

    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void show() {
        System.out.println(name + " " + age);
    }

}
