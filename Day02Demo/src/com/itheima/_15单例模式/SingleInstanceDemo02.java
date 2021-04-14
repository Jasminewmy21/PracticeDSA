package com.itheima._15单例模式;

/**
 * 目标:单例设计模式(面试重点)
 *
 * 什么是单例?
 * --一个类永远只存在一个对象,不能创建多个对象
 *
 * 为什么要用单例?
 * --开发中有很多类的对象我们只需要一个,例如虚拟机对象,任务管理器对象
 * --因为对象越多越占内存,有时候只需要一个对象就可实现业务,单例可以节约内存,提高性能.
 *
 * 如何使用单例?
 * --单例的实现方式有8种,基础班学两种
 *
 * 1.饿汉单例设计模式:
 * --通过类获取单例对象的时候,对象已经提前做好了
 * --实现步骤:
 *      1.定义一个单例类
 *      2.把类的构造器私有
 *      3.定义一个静态成员变量用于存储一个对象
 *      4.提供一个方法返回单例对象
 *
 * 2.懒汉单例设计模式:
 * --通过类获取单例对象的时候发现没有对象才回去创建一个对象
 * --实现步骤:
 *      1.定义一个单例类
 *      2.把类的构造器私有
 *      3.定义一个静态成员变量用于存储一个对象
 *      --懒汉单例【不能直接创建对象,需要的时候才创建出来】
 *      4.定义一个方法返回单例对象
 */

public class SingleInstanceDemo02 {
    public static void main(String[] args) {
        SingleInstanceO2 s1 = SingleInstanceO2.getInstance();
        SingleInstanceO2 s2 = SingleInstanceO2.getInstance();
        System.out.println(s1 == s2);
    }
}

//饿汉单例设计一个单例模式的类
class SingleInstanceO2{
    //2.定义一个静态成员变量用于存储一个对象
    //懒汉单例不能直接创建对象,需要的时候才创建出来
    public static SingleInstanceO2 ins;

    //1.把类的构造器私有,构造器只能在本类中访问
    private SingleInstanceO2() {
    }

    //3.提供一个方法返回单例对象
    public static SingleInstanceO2 getInstance(){
        if(ins == null){
            //第一次来取对象,创建一个对象
            ins = new SingleInstanceO2();
        }
        return ins;
    }
}
