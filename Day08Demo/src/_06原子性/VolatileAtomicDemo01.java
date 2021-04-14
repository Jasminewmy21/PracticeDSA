package _06原子性;

/**
 * 木匾: volatile修饰变量的原子性研究
 *
 * 原子性:
 *      是指一批操作是一个整体,要么同时成功,要么同时失败,不能被干扰
 *      转账: 减钱  价钱 都要同时成功或失败
 *
 * 结论:
 *      volatile只能保证线程间变量的可见性,但是不能保证变量操作的原子性
 */
public class VolatileAtomicDemo01 {
    public static void main(String[] args) {
        Runnable target = new MyRunnable();
        for(int i=1; i<=100; i++){
            //启动100个线程,执行100次任务
            new Thread(target).start();
        }
    }
}

class MyRunnable implements Runnable{
    private volatile int count;

    //一次任务是一个整体,加100.
    @Override
    public void run() {
        for (int i = 1; i <= 100; i++) {
            count++;
            System.out.println("count ==> " + count);
        }
    }
}