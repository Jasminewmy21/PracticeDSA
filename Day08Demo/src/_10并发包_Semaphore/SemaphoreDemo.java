package _10并发包_Semaphore;

import java.util.concurrent.Semaphore;

/**
 * Semaphore的使用介绍(了解)
 *
 * 可以控制线程并发占锁的数量
 */
public class SemaphoreDemo {
    public static void main(String[] args) {
        Service service = new Service();
        for (int i = 1; i <= 5; i++) {
            MyThread myThread = new MyThread(service);
            myThread.start();
        }
    }
}

//创建线程
class MyThread extends Thread{
    private Service service;

    public MyThread(Service service) {
        this.service = service;
    }

    @Override
    public void run() {
        service.login();
    }
}

//业务代码,只new了一次
class Service {
    //1.表示许可的意思,表示最多允许1个线程执行acquire()和release()之间的内容
    private Semaphore semaphore = new Semaphore(1);

    //登录
    public void login(){
        try {
            semaphore.acquire();//上锁
            System.out.println(Thread.currentThread().getName() +
                    "进入 时间= " + System.currentTimeMillis());
            try {
                Thread.sleep(1000);
                System.out.println(Thread.currentThread().getName() + "登陆成功");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() +
                    "离开 时间= " + System.currentTimeMillis());
            semaphore.release();//解锁
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}