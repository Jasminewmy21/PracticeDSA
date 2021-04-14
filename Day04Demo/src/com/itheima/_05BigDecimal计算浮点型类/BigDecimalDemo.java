package com.itheima._05BigDecimal计算浮点型类;

import java.math.BigDecimal;

/**
 * BigDecimal大数据类
 *
 * 引入：
 *      浮点型运算的时候直接 + * / 可能会出现数据失真(精度问题)
 *      BigDecimal可以解决浮点型运算数据失真的问题
 *
 *  BigDecimal类：
 *      包：java.math.BigDecimal
 *      创建对象的方式(最好方式)
 *          public static BigDecimal valueOf(double val):包装浮点数成为大数据对象运算
 *      方法声明：
 *          public BigDecimal add(BigDecimal augend)：加法
 *          public BigDecimal subtract(BigDecimal subtrahend)：减法
 *          public BigDecimal multiply(BigDecimal multiplicand)：乘法
 *          public BigDecimal divide(BigDecimal divisor)：除法
 *
 */
public class BigDecimalDemo {
    public static void main(String[] args) {
        //浮点型运算的时候直接 + * / 可能会出现数据失真(精度问题)
        System.out.println(0.1 + 0.2);
        System.out.println(0.09 + 0.01);
        System.out.println(1.0 - 0.32);
        System.out.println(1.015 * 100);
        System.out.println(1.301 /100);
        System.out.println("---------------------");

        double a = 0.1;
        double b = 0.2;
        double c = a + b;
        System.out.println(c);

        //转成BigDecimal类计算
        BigDecimal a1 = BigDecimal.valueOf(a);
        BigDecimal b1 = BigDecimal.valueOf(b);
        BigDecimal c1 = a1.add(b1);
        System.out.println(c1);

        //BigDecimal只是解决精度问题的手段，double数据才是想要的
        double rs = c1.doubleValue();
        System.out.println(rs);


    }
}
