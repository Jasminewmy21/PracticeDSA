package com.itheima._05异常_编译时异常的处理机制;

import java.io.FileInputStream;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 目标:编译时异常的处理方式一
 *      编译时异常:编译时会出现的,程序员必须编译时就处理,否则代码不通过
 *
 *      抛出异常的格式:
 *          方法 throws 异常1, 异常2, 异常3, ...{
 *
 *          }
 *          建议抛出异常的方式:代表一切异常
 *          方法 throws Exception{
 *
 *          }
 *
 *      方法一:
 *          出现编译时异常的地方层层把异常跑出去给调用者,调用者最终抛给JVM虚拟机
 *          JVM虚拟机输出异常信息,直接干掉程序,这种方式与默认方式是一样的
 *          虽然可以解决代码编译时的错误,但是一旦运行真的出现异常,程序还是会立即死亡
 *
 * 小结:
 *      编译时异常编译阶段就报错,必须程序员处理
 *      方法一:出现异常的地方层层抛出,谁都不处理,最终抛出给虚拟机
 *            虽然可以解决代码编译时的错误,但是一旦运行真的出现异常,程序还是会立即死亡,并不好
 */
public class ExceptionDemo01 {
//    public static void main(String[] args) throws FileNotFoundException, ParseException {
    public static void main(String[] args) throws Exception {
        System.out.println("Start:");
        parseDate("1997-12-12 12:12:12");
        System.out.println("End");
    }

//    private static void parseDate(String time) throws ParseException, FileNotFoundException {
    private static void parseDate(String time) throws Exception {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = sdf.parse(time);
        System.out.println(date);

        InputStream is = new FileInputStream("D:/mshuaige.jpg");
    }
}
