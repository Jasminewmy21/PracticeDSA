package com.itheima._12继承后_构造器的特点;

/**
    木匾：继承后——构造器特点

    特点：
        子类构造器的第一行默认一定会先访问父类的无参数构造器，再执行子类自己的构造器
    why？
        1.子类的构造器的第一行默认有一个super()，默认存在的，根据参数去匹配调用父类的构造器
        2.子类继承父类，子类就得到了父类的属性和行为
            当我们调用子类构造器初始化子类对象数据的时候，必须先调用父类构造器初始化继承父类的属性
 */
public class TestDemo {
    public static void main(String[] args) {
        Dog d = new Dog();

        Dog d2 = new Dog("柯基");
    }
}

class Animal{
    public Animal() {
        System.out.println("父类Animal的无参构造器");
    }
}

class Dog extends Animal{
    private String name;
    public Dog() {
        super();//默认存在的，根据参数去匹配调用父类的构造器
        System.out.println("子类Dog的无参构造器");
    }

    public Dog(String name) {
        super();//默认存在的，根据参数去匹配调用父类的构造器
        System.out.println("子类Dog的有参构造器");
    }
}
