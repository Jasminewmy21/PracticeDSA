package com.itheima._12线程的创建;

/**
 * 线程(Thread)
 *
 * 目标:线程的创建方式1
 *
 * 创建一个新的执行线程有3种方法
 *      1.直接定义一个类继承Thread, 重写run方法,创建线程对象,调用线程对象的start()方法启动线程
 *      2.定义一个线程任务类实现Runable接口,重写run()方法,创建线程任务对象,
 *        把线程任务对象包装成线程对象,调用线程对象的start()方法启动线程
 *      3.实现Callable接口(扩展)
 *
 *
 *  方法1:
 *      1)定义一个线程类继承Thread类
 *      2)重写run()方法
 *      3)创建一个新的线程对象
 *      4)调用线程对象的start()方法启动线程
 *
 *  继承Thread类的优缺点:
 *      优点:编码简单
 *      缺点:线程类已经继承了Thread类了 无法再继承其他类,功能不能通过继承扩展(单继承的局限性)
 *          不能直接得到线程执行的结果,因为run()没有返回值
 *  小结:
 *      线程类是继承了Thread的类
 *      启动线程必须调用start()方法
 *      多线程是并发抢占CPU执行,所以执行的过程中会出现并发随机性
 *
 */
public class ThreadDemo {
    //启动后的ThreadDemo当成一个进程
    //main方法是由主线程执行的,理解成main方法就是一个主线程
    public static void main(String[] args) {
        Thread a = new MyThread();//多态写法
        //调用线程对象的start()方法启动线程,最终还是执行run方法
        a.start();

        for (int i = 0; i < 5; i++) {
            System.out.println("main线程输出:" + i);
        }
    }

}

class MyThread extends Thread{

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("子线程输出:" + i);
        }
    }
}