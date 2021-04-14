package com.itheima._01DateFormat时间格式化类;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 目标：简单日期格式化类SimpleDateFormat解析字符串时间成为日期对象
 *      public Date parse(String date):把字符串的时间解析成日期对象
 *
 * 引入：
 *      Date日期对象 -> 格式化成 -> 喜欢的String时间形式
 *      时间毫秒值 -> 格式化成 -> 喜欢的String时间形式
 *      String时间形式 -> 解析成 -> Date日期对象
 *
 * 小结：
 *      简单日期格式化对象不仅可以把日期对象和时间毫秒值格式化成我们喜欢的字符串时间形式
 *      还可以把字符串时间解析成日期对象
 */
public class SimpleDateFormatDemo03 {
    public static void main(String[] args) throws ParseException {
        //面试题：请问”2019-11-04 09：30：30“，往后1天15小时，30分29s后的时间是多少
        //a.定义一个String时间
        String date = "2019-11-04 09:30:30";

        //b.把String的时间解析成Date日期对象(重点)
        //1.创建一个SimpleDateFormat对象负责解析字符串的时间成为Date对象
        //注意：参数必须与被解析的时间的格式完全一致，否则执行报错
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date newDate = sdf.parse(date);

        //c.得到Date对象的时间毫秒值 + 往后算的时间
        long time = newDate.getTime() + (24L*60*60 + 15*60*60 + 30*60 + 29) * 1000;//注意加L，否则括号里的是int类型，可能溢出

        //d.把时间毫秒值格式化成喜欢的String时间形式
        System.out.println(sdf.format(time));
    }
}
