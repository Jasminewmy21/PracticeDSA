package com.itheima._06可变参数;

import java.util.Arrays;

/**
 * eg:public static <T> boolean addAll(Collection<? super T> c, T... elements)
 *           形参：T... elements，可变参数
 *
 * 可变参数在形参中可以接收多个数据
 * 可变参数的格式:数据类型...参数名称
 *
 * 可变参数的作用:
 *      传输参数非常灵活,方便
 *      可以不传输参数
 *      可以传输一个参数
 *      可以传输多个参数
 *      可以传输一个数组
 *
 * 可变参数的方法内部实质上就是一个数组
 * 注意:
 *      一个形参列表中可变参数只能有一个
 *      可变参数必须放在形参列表的最后面
 *
 * 小结:
 *      1.传输参数非常灵活,方便
 *      2.一个形参列表中可变参数只能有一个
 *      3.可变参数必须放在形参列表的最后面
 */
public class MethodDemo {
    public static void main(String[] args) {
        sum();
        sum(10);
        sum(10,20,30);
        sum(10,20,30,40,50,70,90);
    }

    public static void sum(int...sums){
        System.out.println("元素个数 = " + sums.length);
        System.out.println("元素个数 = " + Arrays.toString(sums));
        System.out.println("----------------------");
    }
}
