package com.itheima._10内部类_匿名内部类;

/**
 * 什么是匿名内部类？
 * --一个没有名字的局部内部类
 * 匿名内部类目的：
 * --简化代码，也是开发中常用的形式
 *
 * 匿名内部类的格式：
 *      new 类名/抽象类/接口（形参）{
 *          方法重写
 *      }
 *
 * 特点：
 * --1.匿名内部类是一个没有名字的局部内部类
 * --2.匿名内部类一旦写出来，就会立即创建一个匿名内部类的对象返回
 * --3.匿名内部类的对象的类型相当于是当前new的那个类的子类类型
 *
 *
 */
public class Anonymity {
    public static void main(String[] args) {
        //之前必须n写一个子类猫，创建一个猫对象才能用run方法
        Animal a = new Cat();
        a.run();
        a.eat();

        //现在不想写这个子类，所以就有了匿名内部类
        Animal a1 = new Animal() {
            @Override
            public void run() {
                System.out.println("猫跑的贼快");
            }
        };


        //写一个狗的匿名内部类
        Animal a2 = new Animal() {
            @Override
            public void run() {
                System.out.println("狗跑的贼快");
            }
        };
        a1.run();
    }
}

class Cat extends Animal{

    @Override
    public void run() {
        System.out.println("猫跑得快");
    }
}

abstract class Animal{
    public abstract void run();

    public void eat(){
        System.out.println("吃");
    }
}
