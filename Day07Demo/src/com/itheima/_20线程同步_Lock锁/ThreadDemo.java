package com.itheima._20线程同步_Lock锁;

/**
 * 解决线程安全的方法三: Lock锁
 *
 * c.lock显示锁
 *      java.util.concurrent.locks.Lock
 *      机制提供了比synchronized代码块和synchronized方法更广泛的锁定操作
 *      同步代码块/同步方法具有的功能Lock都有,除此之外更强大
 *
 * Lock锁也成同步锁,枷锁与释放锁方法化了,如下:
 *      public void lock():加同步锁
 *      public void unlock():释放同步锁
 *
 *      1.创建Lock的实现类ReentrantLock()的对象,多态写法:
 *      private final Lock lock = new ReentrantLock();
 *      2.try catch解决如果该线程进去执行后发生异常的情况
 *      3.finally里释放锁
 *
 * 总结:
 *      线程安全,性能差
 *      线程不安全性能好,加入开发中不会存在多线程安全问题,建议使用线程不安全的设计
 *          StringBuilder线程不安全的
 *          StringBuffer线程安全的
 *
 */
public class ThreadDemo {
    public static void main(String[] args) {
        Account icbc = new Account("11111",1000);

        Thread ms = new DrawThread("ms",icbc);
        ms.start();

        Thread mr = new DrawThread("mr",icbc);
        mr.start();
    }
}
