package com.itheima._11继承后_方法重写;

/**
    目标：方法重写

    概念：
        子类继承了父类，得到了某个父类的方法
        但是觉得不满足
        子类重写一个申明一样的覆盖父类的该方法

    方法重写的校验注解：@Override，优势是：可读性好，安全，优雅

    【方法重写的具体要求】：
    1.子类重写方法的名称和形参列表必须与父类被重新方法一样
    2.子类重写方法的返回值类型申明要么与父类一样，或范围更小
    3.子类写方法的修饰符权限应该与父类的修饰符权限一样，或范围更大
    4.子类重写方法申明抛出的异常应该与父类的一样或者范围更小

    【方法重写的规范】：
        1.加上@Override注解
        2.建议【申明不变，重新实现】

    小结：
        方法重写是子类重写一个与父类申明一样的方法覆盖父类的方法
        加注解
        核心要求：方法名称、形参、列表必须与被重写方法一致
        --方法重载实质是想用方法的内容的，只是传的参数不满足而重载
        --方法重写实质是想用方法表示的属性和参数（即名称、形参等不变），而方法的内容不满足而重写

 */
public class ExtendsDemo01 {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.run();
        cat.eat();

    }
}

class Animal{
    public void run(){
        System.out.println("动物可以跑步");
    }

    public void eat(){
        System.out.println("父类");
    }
}

class Cat extends Animal{

    @Override//重写的检查机制
    public void run(){
        System.out.println("猫跑得很快");//子类成员变量
    }

}