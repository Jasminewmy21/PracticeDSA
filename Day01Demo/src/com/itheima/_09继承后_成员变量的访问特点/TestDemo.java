package com.itheima._09继承后_成员变量的访问特点;

/**
    目标：继承后，成员变量的访问特点
    就近原则：
        子类有就找子类，子类没有找父类，父类没有就报错
 */
public class TestDemo {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.show();

    }
}

class Animal{
    public String name = "父类成员变量";

}
class Cat extends Animal{
    public String name = "子类成员变量";

    public void show(){
        String name = "局部变量";

        System.out.println(name);//局部变量
        System.out.println(this.name);//子类成员变量
        System.out.println(super.name);//子类成员变量
    }

}