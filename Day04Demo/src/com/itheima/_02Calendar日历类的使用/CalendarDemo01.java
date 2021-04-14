package com.itheima._02Calendar日历类的使用;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 *      Calendar代表了系统此刻日期对应的日历对象
 *      Calendar抽象类，不能直接创建对象
 *      Calendar提供了一个类静态方法getInstance，Calendar的getInstance方法返回一个【Calendar对象】，其日历字段已使用当前日期和时间初始化：
 *          语法：Calendar rightNow = Calendar.getInstance();
 *
 *      方法：
 *          1.public static Calendar getInstance()：返回一个日历类对象
 *          2.public int get(int field)：取日期中的某个字段信息
 *          3.public void set(int field,int value)：将给定的日历字段设置为给定的值，即修改日历的某个字段信息
 *          4.public abstract void add(int field, int amount)：为某字段增加或减去指定的值
 *          5.public final Date getTime()：拿到此刻Date对象
 *          6.public long getTimeInMillis()：拿到此刻的时间毫秒值
 *
 */
public class



CalendarDemo01 {
    public static void main(String[] args) {
        //1.返回一个Calendar对象：Calendar rightNow = Calendar.getInstance();
        Calendar rightNow = Calendar.getInstance();
        System.out.println(rightNow);

        //2.获取年/月/等等
        int year = rightNow.get(Calendar.YEAR);
        System.out.println(year);
        int month = rightNow.get(Calendar.MONTH) + 1;//月份从0开始，要+1
        System.out.println(month);
        int date = rightNow.get(Calendar.DATE);
        System.out.println(date);
        System.out.println("------2--------");

        //3.一年中的第几天
        int days = rightNow.get(Calendar.DAY_OF_YEAR);
        System.out.println(days);
        System.out.println("------3--------");

        //4.修改日历的信息
        rightNow.set(Calendar.YEAR,2048);
        System.out.println(rightNow.get(Calendar.YEAR));
        System.out.println("------4--------");

        //5.日历可以得到此刻日期对象
        Date d1 = rightNow.getTime();
        System.out.println(d1);

        Date d2 = new Date();
        System.out.println(d2);
        System.out.println("------5--------");

        //6.此刻时间毫秒值
        long time = rightNow.getTimeInMillis();
        System.out.println(time);
        System.out.println("------6--------");

        //7.请问701天 15小时后是哪个日期？
        //让日历的一年中的现在的date往后走701天
        rightNow.add(Calendar.DAY_OF_YEAR,701);
        rightNow.add(Calendar.HOUR,15);
        long time1 = rightNow.getTimeInMillis();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println(sdf.format(time1));
        System.out.println("------7--------");
    }
}
