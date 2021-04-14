package com.itheima._11继承后_方法重写;

/**
    目标：super调用父类被重写的方法

    super：代表了父类引用
    应用：用在子类的实例方法中调用父类被重写的方法
 */
public class ExtendsDemo02 {
    public static void main(String[] args) {
        SportMan sm = new SportMan();
        sm.run();
        sm.go();
    }
}

class SportMan extends Person{
    @Override
    public void run(){
        System.out.println("运动员跑得更快");
    }

    public void go(){
        super.run();
        run();
    }
}

class Person{
    public void run(){
        System.out.println("人会跑");
    }
}
