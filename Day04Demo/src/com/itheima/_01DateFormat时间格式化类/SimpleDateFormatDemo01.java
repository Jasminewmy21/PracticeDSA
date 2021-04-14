package com.itheima._01DateFormat时间格式化类;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 引入：
 *      我们之前Date类里面得到的Date日期对象或者时间毫秒值的时间形式
 *      在实际开发中并不喜欢，不符合有些时间格式的要求
 *
 *      实质：Date日期对象 -> 格式化成 -> 喜欢的String时间形式
 *
 * DateFormat作用：
 *      1。可以把日期对象或者时间毫秒值格式化(规范化)成喜欢的时间形式
 *      2.可以把字符串的时间形式解析为日期对象
 *
 * DateFormat是抽象类，不能直接使用，要找它的子类：SimpleDateFormat
 * 实际用的是简单日期格式化类：SimpleDateFormat
 *
 * SimpleDateFormat 简单日期格式化类：
 *      包：java.text.SimpleDateFormat
 *      构造器：public SimpleDateFormat(String pattern)：指定时间的格式创建简单日期格式化对象
 *      方法：
 *          【public String format(Date date)】:可以把日期对象格式化成我们喜欢的时间形式，返回的是字符串
 *          public String format(Object time):可以把时间毫秒值格式化成我们喜欢的时间形式，返回的是字符串
 *          public Date parse(String date) throws ParseException：把字符串的时间解析成日期对象
 * 小结：
 *      可以把日期对象格式化成我们喜欢的时间形式：public String format(Date date)
 */
public class SimpleDateFormatDemo01 {
    public static void main(String[] args) {
        //需求：把此刻日期对象格式化成我们喜欢的形式
        //1.得到此刻日期对象
        Date d = new Date();
        System.out.println(d);
        System.out.println("-----------");

        //2.创建一个简单日期格式化对象负责格式化日期对象
        //注意：参数的格式
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss EEE a");

        //调用format方法，得到格式化的字符串时间形式
        String sd = sdf.format(d);
        System.out.println(sd);


    }
}
