package com.itheima._07接口的概述;

/**
 什么是接口？
    接口是更彻底的抽象，JDK1.8之前接口中只能是抽象方法和常量
    接口体现的是规范思想，实现接口的子类必须重写完接口的全部抽象方法

 接口的定义格式：
    修饰符 interface 接口名称{
        //JDK1.8之前接口中只能是抽象方法和常量
    }
    interface定义接口的核心关键字

 接口中成分的研究：
    JDK1.8之前接口中只能是抽象方法和常量

 小结：
    1.接口体现的是规范思想
    2.JDK1.8之前接口中只能是抽象方法和常量
    3.接口中的抽象方法可以省略public abstract不写，默认会有的
    4.接口中常量一般修饰符是：public static final,所以也可以省略，默认会加上
    5.除此之外没有其他成分
 */
public interface InterfaceDemo {
    //1.抽象方法
    //接口中的抽象方法可以省略public abstract不写，默认会有的
//    public abstract void run();
    void run();

    //2.常量:变量值只有一个，在程序运行的过程中不可更改
    //常量一般修饰符是：public static final,所以也可以省略，默认会加上
    //常量的变量名称建议字母全部大写，多个单词用‘_’连接
    public static final String SCHOOL_NAME = "Oxford";

//    public void test(){}//实例方法不行
}
