package com.itheima._15线程的创建方式二;

/**
 * 目标:线程的创建方式二
 *
 * 实现Runnable接口创建线程过程:
 *      1.创建一个[线程任务]类实现Runnable接口
 *      2.重写run方法
 *      3.创建一个[线程任务]对象(注意:[线程任务]对象不是[线程]对象,只是执行线程的任务的
 *      4.把[线程任务]类包装成[线程]类
 *      5.启动线程
 *
 * Thread的构造器:
 *      public Thread(){}
 *      public Thread(String name):分配一个新的 Thread对象。
 *      public Thread(Runnable target)分配一个新的Thread对象。
 *      public Thread(Runnable target, String name) 分配一个新的 Thread对象。
 *
 * 实现Runnable接口创建线程的优缺点
 *      缺点:代码复杂一点
 *          不能直接得到线程执行的结果
 *      优点:
 *          1.线程任务类只是实现了Runnable接口,可以继承其他类,而且可以继续实现其他功能
 *          2.同一个线程任务对象 可以被包装成多个线程对象
 *          3.适合多个线程去共享一个资源(后面学)
 *          4.实现解耦操作,线程任务代码可以被多个线程共享,线程任务代码和线程独立
 *          5.线程池可以放入实现Runnable或Callable线程任务对象(后面学)
 *          注意:Thread类本身就是Runnable接口的实现类
 *
 */
public class ThreadDemo {
    public static void main(String[] args) {
        //3.创建一个[线程任务]对象(注意:[线程任务]对象不是[线程]对象,只是执行线程的任务的
        Runnable r1 = new MyRunnable();
        Runnable r2 = new MyRunnable();

        //4.把[线程任务]类包装成[线程]类
        Thread t1 = new Thread(r1);
        t1.setName("线程1:");

        //4.把[线程任务]类包装成[线程]类,并直接给名字
        Thread t2 = new Thread(r2,"线程2:");

        //优点3的意思
        Thread t3 = new Thread(r2,"线程3:");

        //5.启动线程
        t1.start();
        t2.start();
        t3.start();
    }
}


//1.创建一个[线程任务]类实现Runnable接口

class MyRunnable implements Runnable{
    //2.重写run方法
    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            System.out.println(Thread.currentThread().getName()+" -> " + i);
        }
    }
}