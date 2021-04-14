package com.itheima._04多态_引用类型强制类型转换;

/**
 *
 * 引用数据类型的强制类型转换得语法：
 * --1.父类类型的对象或者变量必须强制类型转换成子类类型得变量，否则报错
 *
 * 强制类型转换得格式：
 *      类型 变量名称 = （类型） 对象或者变量
 *
 *  注意：有继承/实现关系得两个类型就可以进行强制类型转换，编译阶段一定不报错
 *       但是运行阶段可能出现，类型转换异常 classCastException
 *
 *  Java建议在进行强转之前先判断变量得真实类型，再强制类型转换
 *      变量 instanceof 类型：判断前面得变量是否是后面得类型或者其子类类型
 */
public class PolymorphicDemo {
    public static void main(String[] args) {
        Animal a1 = new Wolf();
        a1.run();
//        a.catchSheep();//报错

        //1.把动物类型得变量a1转换成真实得狼类型
        Wolf wolf = (Wolf) a1;
        wolf.catchSheep();

        //2.多态下类型转换异常问题研究（重点）
        Animal a2 = new Cat();
//        Wolf w1 = (Wolf) a2;//编译没有错，运行时有错！ClassCastException（类型转换异常）

        //真实类型得判断
        if(a1 instanceof Wolf){
            Wolf w = (Wolf) a1;
            w.catchSheep();
        }

        if(a2 instanceof Cat){
            Cat c = (Cat) a2;
            c.catchRats();
        }
    }

    public static void go(Animal a){//如果有多态就可以写成Animal a，可以传进来猫，狗等等；不然就只能写一个
        System.out.println("start:");
        a.run();
        System.out.println("end:");
    }
}

class Animal{
    public void run(){
        System.out.println("动物会跑");
    }
}

class Wolf extends Animal{

    @Override
    public void run() {
        System.out.println("狼跑得很快");
    }

    public void catchSheep(){
        System.out.println("狼抓羊");
    }
}

class Cat extends Animal{
    @Override
    public void run() {
        System.out.println("猫跑得一般快");
    }

    public void catchRats(){
        System.out.println("猫捉老鼠");
    }
}