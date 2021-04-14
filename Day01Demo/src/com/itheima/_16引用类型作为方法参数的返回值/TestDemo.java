package com.itheima._16引用类型作为方法参数的返回值;

/**
 引用类型作为Java的数据类型，自然可以作为方法的参数类型和返回值类型
 除了基本数据类型都是引用数据类型

小结：引用类型作为数据类型，可以在一切可以使用类型的地方使用

 */
public class TestDemo {
    public static void main(String[] args) {
        Dog d = new Dog();
        go(d);

        Dog d2 = createDog();
    }

    public static Dog createDog(){
//        Dog taiDi = new Dog();
//        return taiDi;
        return new Dog();
    }

    public static void go(Dog a){//对象回调
        System.out.println("Start:");
        a.run();
        System.out.println("End.");
    }
}

class Dog{
    public void run(){
        System.out.println("狗跑得快");
    }
}
