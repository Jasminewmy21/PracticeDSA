package com.itheima._04异常_异常的默认处理机制;

/**
 * 异常的产生默认的处理过程解析(自动处理的过程):
 *      1.默认会在出现异常的代码那里自动的创建一个异常对象:eg
 *      2.异常会从方法中出现的地方抛出给调用者,调用者最终抛出给JVM虚拟机
 *      3.虚拟机接收到异常对象后,现在控制台直接输出异常栈信息数据
 *      4.直接从当前执行的异常点干掉当前程序
 *      5.后续代码没有机会执行,因为程序已经死亡
 *
 * 小结:
 *      异常一旦出现,会自动创建异常对象,最终抛给虚拟机,
 *      虚拟机只要收到异常,就直接输出异常信息,干掉程序
 *
 *      默认的异常处理机制并不好,一旦真的出现异常,程序立即死亡
 */
public class ExceptionDemo {
    public static void main(String[] args) {
        System.out.println("start:");
        divide(10,0);
        System.out.println("end:");
        }

    private static void divide(int a, int b) {
        System.out.println(a);
        System.out.println(b);

        int c = a / b;
        System.out.println(c);
    }
}
