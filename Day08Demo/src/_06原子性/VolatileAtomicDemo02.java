package _06原子性;

/**
 * 目标: 保证原子性操作的方案
 *                      1.加锁:加锁机制性能较差
 *                      2.原子类
 * 方法一:
 *      1.加锁 synchronized
 *
 *
 */
public class VolatileAtomicDemo02 {
    public static void main(String[] args) {
        Runnable target = new MyRunnable02();
        for (int i = 1; i <= 100 ; i++) {
            new Thread(target).start();
        }
    }
}

class MyRunnable02 implements Runnable{
    private volatile int count;

    @Override
    public void run() {
        synchronized (this) {
            for (int i = 1; i <= 100; i++) {
                count ++;
                System.out.println("count ==> " + count);
            }
        }
    }
}