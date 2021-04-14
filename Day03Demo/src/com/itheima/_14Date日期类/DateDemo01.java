package com.itheima._14Date日期类;

import java.util.Date;

/**
 * Date类的使用
 *
 * Java是面向对象的，会用一个类代表一个事物
 * Date类在Java中代表的是【系统当前此时此刻日期时间对象】
 *
 * Date类：
 *      包：java.util.Date
 *      构造器：
 *      --public Date()：创建当前系统的此刻日期时间对象
 *      --public Date(long time)
 *
 *      方法：
 *      --public long getTime()：返回从1970.1.1 00:00:00以来走过的时间的[毫秒值]
 *
 * 时间记录的两种方式：
 * --1.Date日期对象
 * --2.时间毫秒值
 */
public class DateDemo01 {
    public static void main(String[] args) {
        Date d = new Date(1,2,3);//过时的，不用

        //a.创建一个日期对象代表了系统[此刻]日期时间对象
        Date d1 = new Date();
        System.out.println(d1);//Sat Mar 06 16:45:22 CST 2021

        //b.拿当前日期对象的时间毫秒值
        long time = d1.getTime();
        System.out.println(time);//1615020322848
    }
}
