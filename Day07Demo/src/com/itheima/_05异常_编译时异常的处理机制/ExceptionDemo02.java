package com.itheima._05异常_编译时异常的处理机制;

import java.io.FileInputStream;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 目标:编译时异常的处理方式二
 * <p>
 * 方法二:在出现异常的地方自己处理,谁出现谁处理
 *
 * 自己捕获异常和处理异常的格式:捕获处理
 *    try{
 *            //可能出现异常的代码
 *       }catch(异常类型1 变量){
 *             异常处理
 *       }catch(异常类型2 变量){
 *             异常处理
 *       }catch(异常类型3 变量){
 *             异常处理
 *       }...
 *
 *      监视捕获处理异常企业级写法:
 *      try{
 *          //可能出现异常的代码
 *      }catch(Exception e){
 *          e.printStackTrace();//直接打印异常栈信息
 *      }
 *      可以捕获处理一切异常类型
 *
 * 小结:
 *      方法二:可以处理异常,并且出现异常后代码不会死亡
 *      这种方案还可以
 *      但是,从理论上来说,这种方式不是最好的,上层调用者不能直接知道底层的执行情况
 */
public class ExceptionDemo02 {
    public static void main(String[] args) {
        System.out.println("Start:");
        parseDate("1997-12-12 12:12:12");
        System.out.println("End");
    }

    //企业级写法
    private static void parseDate(String time){
        try{
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            Date date = null;
            date = sdf.parse(time);
            System.out.println(date);

            InputStream is = new FileInputStream("D:/mshuaige.jpg");
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    //JDK1.7以后可以并列异常
//    private static void parseDate(String time) {
//        try {
//            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//            Date date = null;
//            date = sdf.parse(time);
//            System.out.println(date);
//
//            InputStream is = new FileInputStream("D:/mshuaige.jpg");
//        } catch (FileNotFoundException | ParseException e) {
//            e.printStackTrace();
//        }
//    }


}
