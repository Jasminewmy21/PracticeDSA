package com.itheima._03Math类的使用;

/**
 * Math类常见方法：
 *
 */
public class MathDemo {
    public static void main(String[] args) {
        //1.取绝对值
        System.out.println(Math.abs(-10));
        System.out.println(Math.abs(20.56));

        //2.向上取整：5
        System.out.println(Math.ceil(4.000000001));

        //3.向下取整：4
        System.out.println(Math.floor(4.99999999));

        //4.求指数次方
        System.out.println(Math.pow(2,3)); //2^3 = 8

        //5.四舍五入
        System.out.println(Math.round(4.4999999));
        System.out.println(Math.round(4.5000000));

    }
}
