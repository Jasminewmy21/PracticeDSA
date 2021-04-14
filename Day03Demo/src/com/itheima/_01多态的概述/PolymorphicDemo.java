package com.itheima._01多态的概述;

import org.w3c.dom.ls.LSOutput;

/**
 *  面向对象的三大特征：
 *  --封装：安全性和组件化
 *  --继承：代码的复用性
 *  --多态：
 *
 *  多态的形式：
 *      父类类型  对象名称 = new  子类构造器；
 *      接口      对象名称 = new 实现类构造器；
 *
 *  父类类型的范围  > 子类类型范围
 *
 *  多态的概念：
 *      同一个类型的对象，执行同一个行为，在不同的状态下会表现出不同的行为特征
 *
 *  多态的识别技巧：
 *      对于方法的调用：编译看左边，运行看右边
 *      对于变量的调用：编译看左边，运行看左边
 *
 *  多态的使用前提：
 *  --1.必须存在继承或者实现方法
 *  --2.必须存在父类类型的变量引用子类类型的对象
 *  --3.必须存在方法重写
 *
 *  小结：
 *      记住多态的形式，识别，概念
 */
public class PolymorphicDemo {
    public static void main(String[] args) {
        Animal a = new Cat();//必须存在父类类型的变量引用子类类型的对象
        a.run();

        Animal d = new Dog();
        d.run();
        System.out.println(d.name);//对于变量的调用：编译看左边，运行看左边
    }
}

class Dog extends Animal{//必须存在继承或者实现方法
    public String name = "狗";

    //必须存在方法重写
    @Override
    public void run(){
        System.out.println("狗跑得快！");
    }

    public void eat(){
        System.out.println("狗吃骨头");
    }
}

class Cat extends Animal{
    public String name = "猫";
    @Override
    public void run(){
        System.out.println("猫跑起来！");
    }
}
class Animal{
    public String name = "动物";
    public void run(){
        System.out.println("动物跑！");
    }
}
