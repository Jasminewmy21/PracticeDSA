package com.itheima._14final关键字;

/**
 * final修饰变量的总规则:有且仅能被赋值一次
 *
 * 变量有几种:
 * 1.成员变量
 * --静态成员变量
 * --实例成员变量
 * 2.局部变量
 * --只能在方法、构造器、代码块、for循环中，用完作用范围就消失
 *
 * final修饰局部变量:
 * --让值被固定或者说保护起来,执行的过程中防止被修改
 */
public class FinalDemo02 {
    public static void main(String[] args) {
        final int age = 10;
//        age = 100;

        final double pai = 3.1415;
    }

    public static void buy(final double r){
//        r = 0.1;//报错,因为第二次赋值了
    }
}
