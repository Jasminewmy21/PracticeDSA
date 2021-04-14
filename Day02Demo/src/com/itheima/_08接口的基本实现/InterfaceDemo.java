package com.itheima._08接口的基本实现;

/**
 子类     继承    父类
 实现类   实现    接口

 类与类是继承关系
 类与接口是实现关系，接口是被类实现的
 实现接口的类称为：实现类

 类实现接口的格式：
    修饰符  class  实现类名称  implements  接口1，接口2，接口3，接口4，...{

    }
    implements：类实现接口的关键字

 小结：
    1.一个类实现接口，这个类称为实现类
    2.接口是用来被类实现的，实现的关键字是implements，接口可以多实现
    3.一个类实现接口必须重写完这个接口中的所有抽象方法，否则这个类就要定义成抽象类
 */

//实现类
public class InterfaceDemo {
    public static void main(String[] args) {
        BasketballMan bm = new BasketballMan("Kris Wu");
        bm.competition();
        bm.run();

    }
}

class BasketballMan implements SportMan{
    private String name;

    public BasketballMan(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println(name + "要跑得快");
    }

    @Override
    public void competition() {
        System.out.println(name + "要5V5");
    }
}

interface SportMan{
    void run();
    void competition();
}