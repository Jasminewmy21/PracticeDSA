package com.itheima._19线程同步_同步方法;

/**
 * 线程同步解决多个线程同时操作同一个共享资源的时候可能出现线程安全问题
 *
 * 线程同步的做法:加锁
 *      是把[共享资源]进行上锁,每次只能一个线程进入,访问完毕后,其他线程才能进来
 *
 * 线程同步的方法:3种
 *      1.同步代码块
 *      2.同步方法
 *      3.lock显示锁
 *
 * b.同步方法
 *      作用:把出现线程安全问题的核心方法上锁,每次只能一个线程进入
 *          执行完毕以后自动解锁,其他线程才可以进来执行
 *      用法:直接给方法加上一个修饰符synchronized
 *
 *      原理:和同步代码块的底层原理其实是完全一样的,只是同步方法把整个方法的代码都锁起来了
 *          同步方法其实底层也是有锁对象的:
 *                --在实例方法默认中this作为锁对象
 *                --在静态方法中默认类名.class字节码作为锁对象
 */
public class ThreadDemo {
    public static void main(String[] args) {
        //a.创建一个共享资源账户对象
        Account acc = new Account("00001",10000);

        //b.创建2个线程对象去账户对象中取钱
        Thread mr = new DrawThread("ms",acc);
        mr.start();

        Thread ms = new DrawThread("mr",acc);
        ms.start();
    }
}
