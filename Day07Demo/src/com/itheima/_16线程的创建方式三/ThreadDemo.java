package com.itheima._16线程的创建方式三;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * 目标:线程的创建方法三
 *
 *  实现Callable接口:
 *      1.定义一个线程任务类实现Callable接口,申明线程执行的结果类型
 *      2.重写线程任务类的call方法,这个方法可以直接返回执行的结果
 *      3.创建一个Callable的线程任务对象
 *      4.把Callable的线程任务对象包装成一个FutureTask对象
 *      5.把未来任务对象包装成线程对象
 *      6.调用线程的start()方法启动线程
 *
 *      缺点:代码复杂
 *      优点:
 *          1.线程任务类只是实现了Callable接口,可以继承其他类,而且可以继续实现其他功能
 *          2.同一个线程任务对象 可以被包装成多个线程对象
 *          3.适合多个线程去共享一个资源(后面学)
 *          4.实现解耦操作,线程任务代码可以被多个线程共享,线程任务代码和线程独立
 *          5.线程池可以放入实现Runnable或Callable线程任务对象(后面学)
 *          注意:Thread类本身就是Runnable接口的实现类
 *          6.能直接得到线程执行的结果
 */
public class ThreadDemo {
    public static void main(String[] args) {
        //3.创建[callable线程任务]类对象
        Callable c = new MyCallable();

        //4.Callable线程任务类不能直接创建Thread类对象
//        Thread t = new Thread(c);
        //所以要先转成未来任务对象,FutureTask底层实现了Runnable接口,等于还是把Callable线程任务类,转化成Runnable的实现类
        FutureTask task = new FutureTask(c);

        //再把FutureTask对象拿去,创建Thread类
        Thread t = new Thread(task);

        //5.开始子线程
        t.start();


        //主线程
        int sum = 0;
        for (int i = 0; i < 20; i++) {
            System.out.println(Thread.currentThread().getName() + "->" + i);
            sum += i;
        }
        System.out.println(Thread.currentThread() + "->" + sum);

        //6.取返回值,能直接得到线程执行的结果
        try {
            String str = (String) task.get();;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

class MyCallable implements Callable {
    @Override
    public String call() throws Exception {
        //计算1-10的和返回
        int sum = 0;
        for (int i = 0; i < 20; i++) {
            System.out.println(Thread.currentThread().getName() + " -> " + i);
            sum += i;
        }
        return Thread.currentThread().getName() + "的和是=" + sum;
    }
}
