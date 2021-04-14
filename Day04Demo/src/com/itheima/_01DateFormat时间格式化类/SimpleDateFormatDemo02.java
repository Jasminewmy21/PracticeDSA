package com.itheima._01DateFormat时间格式化类;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * public String format(Object time):可以把时间毫秒值格式化成我们喜欢的时间形式，返回的是字符串
 *
 * 时间毫秒值 -> 格式化成 -> 喜欢的String时间形式
 */
public class SimpleDateFormatDemo02 {
    public static void main(String[] args) {
        //121s后的时间是多少，格式化输出
        //得到此刻日期对象
        Date date = new Date();
        System.out.println(date);

        //得到当前时间的时间毫秒值
        long time = date.getTime();
        time += 121 * 1000;

        //格式化时间毫秒值
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss EEE a");
        System.out.println(sdf.format(time));

    }
}
