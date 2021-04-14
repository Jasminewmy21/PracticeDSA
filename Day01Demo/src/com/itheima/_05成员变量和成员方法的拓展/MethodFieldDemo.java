package com.itheima._05成员变量和成员方法的拓展;

/**
 *  重点看
    拓展：成员变量和成员方法的拓展（面试常考）

    方法：实例方法、静态方法
    成员变量：实例成员变量、静态成员变量

    8中访问形式的问答：
        1.实例方法是否能直接访问实例成员变量？可以，因为它们都属于对象
        2.实例方法是否能直接访问静态成员变量？可以，静态成员变量可以被共享访问
        3.实例方法是否能直接访问实例成员方法？可以，因为它们都属于对象
        4.实例方法是否能直接访问静态成员方法？可以，静态方法可以被共享访问

        5.静态方法是否能直接访问实例变量？不可以，实例变量必须用对象访问
        6.静态方法是否能直接访问静态变量？可以，静态成员变量可以被共享访问
        7.静态方法是否能直接访问实例方法？不可以，实例方法必须用对象访问
        8.静态方法是否能直接访问静态方法？可以，静态方法可以被共享访问
 */
public class MethodFieldDemo {
    //静态成员变量
    public static String schoolName = "UCLA";

    //实例成员变量
    private String name;

    //静态方法
    public static void laugh(){
        System.out.println(schoolName);
    }

    //实例方法
    public void run(){
        System.out.println(schoolName);
    }

    //实例方法
    public void eat(){
        run();
        System.out.println(name);
        System.out.println(schoolName);
    }
}
