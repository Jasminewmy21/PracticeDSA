package com.itheima._17线程安全;

/**
 * 目标:线程安全问题模拟
 *
 * 线程安全问题:多个线程同时操作同一个共享资源的时候可能出现线程安全问题
 *
 * 案例:模拟两个人取同一个账户的钱
 *     即两个线程同时操作同一个共享资源,出现线程安全问题
 *
 * 小结:
 *     多个线程同时操作同一个共享资源的时候可能出现线程安全问题
 */
public class ThreadSafe {
    public static void main(String[] args) {
        //a.创建一个共享资源账户对象
        Account acc = new Account("000001",10000);

        //b.创建2个线程对象去账户对象中取钱
        Thread mr = new DrawThread("mr",acc);
        mr.start();

        Thread ms = new DrawThread("ms",acc);
        ms.start();
    }
}
