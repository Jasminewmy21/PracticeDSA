package _08并发包_CountDownLatch;

import java.util.concurrent.CountDownLatch;

/**
 * 目标:CountDownLatch的使用
 *
 * CountDownLatch允许一个或多个线程等待其他线程完成操作,再执行自己
 * 例如: Thread1要打印A,B Thread2要打印B 但是Thread1要在打印完A之后就让Thread2打印B,之后再打印C
 *
 *      需求:
 *          提供Thread1,打印A,C
 *          提供Thread2,打印B
 *
 *      构造器:
 *          public CountDownLatch(int count) //初始化唤醒需要的down几步
 *
 *      方法:
 *          public void await() throw InterruptedException //让当前线程等待,必须down
 *          public void countDown() //计数器进行-1 (down 1)
 */
public class CountDownLatchDemo {
    public static void main(String[] args) {
        //创建一个CountDownLatch对象用于监督A,B线程的执行情况
        CountDownLatch c = new CountDownLatch(1);
        new ThreadA(c).start();
        new ThreadB(c).start();



    }
}

class ThreadA extends Thread{
    private CountDownLatch c;

    public ThreadA(CountDownLatch c) {
        this.c = c;
    }

    @Override
    public void run() {
        System.out.println("A");
        //等待自己,根据监督者中的数量1决定让当前线程让出CPU等待自己
        try {
            c.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("C");
    }
}

class ThreadB extends Thread{
    private CountDownLatch c;

    public ThreadB(CountDownLatch c) {
        this.c = c;
    }

    @Override
    public void run() {
        System.out.println("B");
        c.countDown();//让监督者中的计数器-1
        c.countDown();//让监督者中的计数器-1
    }
}