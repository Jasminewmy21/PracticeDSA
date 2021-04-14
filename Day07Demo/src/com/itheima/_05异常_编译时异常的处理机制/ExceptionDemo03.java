package com.itheima._05异常_编译时异常的处理机制;

import java.io.FileInputStream;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 目标:编译时异常的处理方式三
 *
 * 方法三:
 *      在异常出现的地方把异常一层一层的抛出给最外层调用者
 *      最外层调用者集中捕获处理(规范做法)
 *
 * 小结:
 *      编译时异常处理方法三:底层出现的异常抛出给最外层调用者集中捕获处理
 *      这种方案最外层调用者可以知道底层执行的情况,同时程序在出现异常后也不会立即死亡
 *      这是理论上最好的方式
 *
 *      虽然异常有三种处理方式,但是开发中只要能解决问题,每种方式都有可能用到
 *
 */
public class ExceptionDemo03 {
    public static void main(String[] args) {
        System.out.println("Start:");
        try {
            parseDate("1997-12-12 12:12:12");
            System.out.println("成功执行");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("失败");
        }
        System.out.println("End");
    }

    private static void parseDate(String time) throws Exception {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = sdf.parse(time);
        System.out.println(date);

        InputStream is = new FileInputStream("D:/mshuaige.jpg");
    }
}
