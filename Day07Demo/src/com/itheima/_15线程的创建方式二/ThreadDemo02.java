package com.itheima._15线程的创建方式二;
/**
 * 方式二的匿名内部类简化写法
 */
public class ThreadDemo02 {
    public static void main(String[] args) {
        //方法二的简化写法
        //1.不要[线程任务]类,直接new匿名内部类写法
        /**
         a)
        class MyRunnable implements Runnable{
            //2.重写run方法
            @Override
            public void run() {
                for (int i = 0; i < 20; i++) {
                    System.out.println(Thread.currentThread().getName()+" -> " + i);
                }
            }
        }
        Runnable r1 = new MyRunnable();
            ==
        Runnable r1 = new Runnable(){
            @Override
            public void run(){
                for(int i=0; i<20; i++
                }
            };
        b)
        Thread t1 = new Thread(r1)
        ==
        Thread t1 = new Thread(new Runnable(){
            @Override
            public void run(){
                for(int i=0; i<20; i++
            }
        });

        c)
        t1.start()
        ==
            new Thread(new Runnable(){
            @Override
            public void run(){
            for(int i=0; i<20; i++
            }
            }).start();
         */

        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 20; i++) {
                    System.out.println(Thread.currentThread().getName() + "->" + i);
                }
            }
        }).start();
    }
}
