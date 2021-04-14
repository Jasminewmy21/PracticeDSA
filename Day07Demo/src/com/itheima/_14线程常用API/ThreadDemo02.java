package com.itheima._14线程常用API;

/**
 * 休眠方法:
 *      public static void sleep(long millis)
 *                          throws InterruptedException
 *      使当前正在执行的线程停留（暂停执行）指定的毫秒数
 *      这取决于系统定时器和调度程序的精度和准确性。
 *      线程不会丢失任何显示器的所有权。
 */
public class ThreadDemo02 {
    public static void main(String[] args) {
        for (int i = 0; i < 20; i++) {
            System.out.println(i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
