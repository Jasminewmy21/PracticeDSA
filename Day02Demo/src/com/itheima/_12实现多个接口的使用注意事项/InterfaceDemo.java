package com.itheima._12实现多个接口的使用注意事项;

/**
 * 1.如果实现了多个接口,多个接口中存在同名的静态方法并不会冲突
 * --是因为只能通过接口名称访问各自的静态方法
 *
 * 2.当一个类,既继承一个父类,又实现若干个接口时,(重点)
 * --父类中的成员方与接口中的默认方法重名,子类就近选择执行父类的成员方法
 *
 * 3.当一个类实现多个接口时,多个接口中存在同名的默认方法
 *  --实现类必须重写这个方法
 *
 *  4.接口中,没有构造器,不能创建对象(重点)
 *  --接口是更彻底地抽象,连构造器都没有,自然不能创建对象
 *
 *  接口
 *  抽象类
 *  没有谁更强,各有优点
 */
public class InterfaceDemo {
    public static void main(String[] args) {
        Cat c = new Cat();
        c.run();
        c.eat();
    }
}
class Cat extends Animal implements A, B{
    /**
     *  * 3.当一个类实现多个接口时,多个接口中存在同名的默认方法
     *  *  --实现类必须重写这个方法
     */
    @Override
    public void eat() {
        System.out.println("实现类重写了接口里面重名的方法");
    }
}

class Animal{
    public void run(){
        System.out.println("父类里的成员方法");
    }
}

interface A{
    default void run(){
        System.out.println("接口A里的默认方法");
    }
    static void test(){
        System.out.println("A");
    }

    default void eat(){
        System.out.println("接口A里的默认方法");
    }
}

interface B{
    static void test(){
        System.out.println("B");
    }

    default void eat(){
        System.out.println("接口B里的默认方法");
    }
}