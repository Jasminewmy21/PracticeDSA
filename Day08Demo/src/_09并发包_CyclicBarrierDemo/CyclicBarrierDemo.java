package _09并发包_CyclicBarrierDemo;

import java.util.concurrent.CyclicBarrier;

/**
 * 目标: CyclicBarrier
 * <p>
 * 可以用于多线程计算数据,
 */
public class CyclicBarrierDemo {
    public static void main(String[] args) {
        CyclicBarrier cyclicBarrier = new CyclicBarrier(5, new Meeting());

        for (int i = 1; i <= 5; i++) {
            new EmployeeThread("员工"+i, cyclicBarrier).start();
        }
    }
}

class Meeting implements Runnable{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + "开始组织会议");
    }
}


class EmployeeThread extends Thread {
    private CyclicBarrier cyclicBarrier;

    public EmployeeThread(String name, CyclicBarrier cyclicBarrier) {
        super(name);
        this.cyclicBarrier = cyclicBarrier;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(3000);
            System.out.println(Thread.currentThread().getName() + "进入会议室");
            cyclicBarrier.await();//每个线程调用await方法告诉CyclicBarrier我已经到达了屏障,然后当前线程被回收
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

