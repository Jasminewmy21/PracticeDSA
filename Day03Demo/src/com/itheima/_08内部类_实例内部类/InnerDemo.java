package com.itheima._08内部类_实例内部类;

/**
 * 很少用，了解
 *
 * 什么是实例内部类（成员内部类）？
 * --无static修饰的内部类，属于外部类的每个对象的，跟着对象一起加载
 *
 * 实例内部类（成员内部类)的成分特点：
 * --不能定义静态成员，其他都可以定义
 *      why?因为实力内部类是属于外部类的每个对象的，而对象是没有静态区的，静态的东西属于类
 *      or静态的东西只能加载一次，如果成员内部类可以有静态成员，每次创建一个外部类的对象就会加载一次，与语法相悖
 * --可以定义常量
 *
 * 访问格式：
 * --外部类名称.内部类名称
 *
 * 创建对象格式：
 *        外部类名称.内部类名称  对象名称 = new  外部类名称.new  内部类构造器；
 *          因为成员内部类是属于外部类的每个对象的，所以要先new外部类对象，再new内部类
 *
 * 拓展：
 *      实例内部类中是否可以直接访问外部类的静态成员？可以，因为它在静态区，都可以共享访问
 *      实例内部类中是否可以直接访问外部类的实例成员？可以，因为外部类的实例成员是属于外部类对象，实力内部类也是属于外部类对象，
 *
 */
public class InnerDemo {
    public static void main(String[] args) {
        Outer.Inner in = new Outer().new Inner();
    }
}

//外部类
class Outer{
    public static String brand;
    public int marque;

    public class Inner{
        private int age;

        public void show(){
            System.out.println(brand);//实例内部类中可以直接访问外部类的静态成员
            System.out.println(marque);//实例内部类中可以直接访问外部类的实例成员
        }

        //不能定义静态成员
//        public static String name;
//        public static void run(){
//
//        }
    }
}