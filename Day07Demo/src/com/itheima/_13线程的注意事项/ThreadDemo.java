package com.itheima._13线程的注意事项;

/**
 * 目标:线程的注意事项
 *
 *      1.线程的启动必须调用的是start()方法(不要调错了),否则当成普通类处理
 *          --如果线程直接调用run()方法,相当于变成了普通类的执行,此时将只有主线程在执行
 *          --start()方法的底层其实是给CPU注册当前线程,并触发run()方法执行
 *      2.建议线程先创建子线程,主线程的任务放在之后,否则主线程永远先执行完
 *
 *
 */
public class ThreadDemo {
    //启动后的ThreadDemo当成一个进程
    //main方法是由主线程执行的,理解成main方法就是一个主线程
    public static void main(String[] args) {
        Thread a1 = new MyThread1();//多态写法
        //调用线程对象的start()方法启动线程,最终还是执行run方法
        a1.run();//这时候就是只有一个线程主线程,代码按顺序执行

        for (int i = 0; i < 5; i++) {
            System.out.println("main线程输出:" + i);
        }
    }

}

class MyThread1 extends Thread{

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("子线程输出:" + i);
        }
    }
}
