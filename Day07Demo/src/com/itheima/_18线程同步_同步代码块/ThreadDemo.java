package com.itheima._18线程同步_同步代码块;


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
 * a.同步代码块
 *      作用:把出现线程安全问题的核心代码上锁,每次只能一个线程进入
 *          执行完毕以后自动解锁,其他线程才可以进来执行
 *
 *      格式:
 *          synchronized(锁对象){
 *              //访问共享资源的核心代码
 *          }
 *          锁对象:理论上可以是任意的"唯一"对象即可
 *          原则上:锁对象建议使用共享资源
 *                --在实例方法中建议用this作为锁对象,此时this正好是共享资源,必须代码高度面向对象
 *                --在静态方法中建议用类名.class字节码作为锁对象
 */
public class ThreadDemo {
    public static void main(String[] args) {
        //a.创建一个共享资源账户对象
        Account acc = new Account("0000001",10000);

        //b.创建2个线程对象去账户对象中取钱
        Thread mr = new DrawThread("mr",acc);
        mr.start();

        Thread ms = new DrawThread("ms",acc);
        ms.start();
    }
}
