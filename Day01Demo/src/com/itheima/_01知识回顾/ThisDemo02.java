package com.itheima._01知识回顾;

/**
    目标：this关键字知识回顾

    this关键字作用：
        this代表了当前对象的引用
        this关键字可以用在[实例方法]和[构造器]中
        this用在方法中，谁调用这个方法，this就代表谁
        this用在构造器，代表了构造器正在初始化的那个对象的引用

        没有局部变量的时候this可以省略
 */
public class ThisDemo02 {
    public static void main(String[] args) {
        Animal dog = new Animal();
        dog.setName("柯基");
    }
}

class Animal{
    private String name;
    private int age;
    private char gender;

    public Animal() {
    }

    public Animal(String name, int age, char gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String getName() {
        return name;//this.name,此时不会冲突，所以this可以不写，即没有局部变量的时候this可以省略
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

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }
}