package com.itheima._10继承后_成员方法的特点;

/**
    目标：继承后，成员方法的访问特点
    就近原则：
        子类有就找子类，子类没有找父类，父类没有就报错
 */
public class TestDemo {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.run();
        cat.eat();

    }
}

class Animal{
    public void run(){
        System.out.println("父类");
    }

    public void eat(){
        System.out.println("父类");
    }
}

class Cat extends Animal{

    public void run(){
        System.out.println("子类");//子类成员变量
    }

}