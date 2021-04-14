package com.itheima._02多态的优劣;

/**
 * 优势：
 * --1.在多态形式下，右边对象可以实现组件化切换，业务功能也随之改变，
 *     便于扩展和维护，可以实现类与类之间的解耦
 * --2.实际开发的过程中，父类类型作为方法形式参数，传递子类对象给方法，
 *     可以传入一切子类对象进行方法的调用，更能体现出多态的扩展性与便利
 *
 *
 * 劣势：
 * --1.多态形式下，不能直接调用子类特有的功能。编译看左边！！
 *     父类中没有子类独有的功能，所以代码在编译阶段就直接报错
 *
 * 小结：
 *      记住语法
 */
public class PolymorphicDemo {
    public static void main(String[] args) {
        Animal a = new Cat();//必须存在父类类型的变量引用子类类型的对象
        a.run();
//        a.catchRats();//报错，编译看左边，左边没有子类的独有方法


    }

    //实际开发的过程中，父类类型作为方法形式参数，传递子类对象给方法，
    //可以传入一切子类对象进行方法的调用，更能体现出多态的扩展性与便利
    public static void go(Animal a){//如果有多态就可以写成Animal a，可以传进来猫，狗等等；不然就只能写一个
        System.out.println("start:");
        a.run();
        System.out.println("end:");
    }
}

class Dog extends Animal {//必须存在继承或者实现方法

    //必须存在方法重写
    @Override
    public void run(){
        System.out.println("狗跑得快！");
    }

    public void lookDoor(){
        System.out.println("狗看门");
    }
}

class Cat extends Animal {

    @Override
    public void run(){
        System.out.println("猫跑起来！");
    }

    public void catchRats(){
        System.out.println("猫抓老鼠");
    }
}
class Animal{

    public void run(){
        System.out.println("动物跑！");
    }
}
