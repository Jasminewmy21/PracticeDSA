package com.itheima._14线程常用API;

/**
 * 目标:通过Thread类的有参构造器为当前线程对象取名字
 *
 *      public Thread()
 *      public Thread(String name):创建线程对象并取名
 */
public class ThreadDemo03 {
    public static void main(String[] args) {
        Thread t1 = new MyThread1("1号线程");//多态写法
        t1.start();
        System.out.println(t1.getName());

        Thread t2 = new MyThread1("2号线程");//多态写法
        t2.start();
        System.out.println(t2.getName());//获取线程名称

        Thread.currentThread().setName("最强线程");
        for (int i = 0; i < 50; i++) {
            System.out.println(Thread.currentThread().getName()+" -> " + i);
        }
    }
}

class MyThread1 extends Thread{

    public MyThread1(String name){//父类的有参构造器
        super(name);
    }
    @Override
    public void run() {
        for (int i = 0; i < 50; i++) {
            System.out.println(Thread.currentThread().getName()+" -> " + i);
        }
    }
}
