package com.itheima._14线程常用API;

/**
 * Thread类常用API:
 *      public final void setName(String name)将此线程的名称更改为等于参数name
 *      public final String getName()返回此线程的名称。
 *      --线程存在默认名称:
 *          子线程默认名:Thread-索引
 *          主线程默认名:main
 *      public static Thread currentThread()返回对当前正在执行的线程对象的引用。
 *
 */
public class ThreadDemo01 {
    public static void main(String[] args) {
        Thread t1 = new MyThread();//多态写法
        t1.setName("1号线程");
        t1.start();
        System.out.println(t1.getName());

        Thread t2 = new MyThread();//多态写法
        t2.setName("2号线程");
        t2.start();
        System.out.println(t2.getName());//获取线程名称

        Thread m = Thread.currentThread();
        m.setName("最强线程");
        System.out.println(m.getName());

        for (int i = 0; i < 50; i++) {
            System.out.println(m.getName()+" -> " + i);
        }
    }

}

class MyThread extends Thread{

    @Override
    public void run() {
        for (int i = 0; i < 50; i++) {
            System.out.println(Thread.currentThread().getName()+" -> " + i);
        }
    }
}