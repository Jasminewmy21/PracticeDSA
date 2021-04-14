package com.itheima._14final关键字;

/**
 * 目标:final修饰静态成员变量
 *
 * final修饰静态成员变量,变量就变成了常量
 * 常量:public static final修饰,名称字母全部大写,多个单词用下划线连接
 *
 * 拓展:
 * 1.final修饰静态成员变量可以在哪些地方赋值一次
 * --定义的时候赋值一次
 * --可以在静态代码块中赋值一次
 *
 */
public class FinalDemo03 {
    public static final String SCHOOL_NAME = "Oxford";
    public static final String SCHOOL_NAME1;
    static {
        SCHOOL_NAME1 = "Oxford";//放在静态代码块就可以
    }

    public static void main(String[] args) {
        //SCHOOL_NAME = "Oxford";//报错,第二次赋值
//        SCHOOL_NAME1 = "Oxford";静态成员变量只会加载一次,放在main方法里面赋值,随着代码多次运行,就会加载不止一次,所以不行
    }
}
