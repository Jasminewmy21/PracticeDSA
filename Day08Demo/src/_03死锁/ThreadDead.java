package _03死锁;

/**
 * 目标:死锁
 *
 * 死锁是这样的一种情形:多个线程同时被阻塞,他们中的一个或者全部都在等待某个资源被释放
 *                   由于线程被无限期阻塞,因此程序不能正常终止
 *
 * 死锁经典案例: 客户(占用资金,等待经销商的货源),经销商(占用货源,等待客户的资金)
 *
 * Java死锁产生的四个必要条件:
 *      1.互斥使用:当资源被一个线程使用(占用)时,别的线程不能使用
 *      2.不可抢夺:资源请求者不能强制从资源占有者手里抢夺资源,资源只能由资源占有者主动释放
 *      3.请求和保持:当资源请求者请求其他的资源的同时保持对原有资源的占有
 *      4.循环等待:存在一个等待循环队列,p1要p2的资源,p2要p1的资源,这样就形成一个等待环
 *
 *      当上述四个条件都成立的时候,便形成死锁.当然,思索地情况下如果打破上述任意条件
 *      便可以让死锁消失
 *      开发中要避免死锁
 *
 * 案例:代码实现,一个必然死锁的案例(面试需要)
 *
 * 小结:
 *      1.死锁代码形式上通常需要锁的嵌套访问
 */

public class ThreadDead {
    //定义2个资源对象
    public static Object resources01 = new Object();
    public static Object resources02 = new Object();

    public static void main(String[] args) {
        //匿名内部类法定义2个线程
        new Thread(new Runnable(){
            @Override
            public void run() {
                synchronized (resources01){
                    System.out.println("线程1占用资源1,请求资源2");

                    try {
                        Thread.sleep(1000);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }

                    synchronized (resources02){
                        System.out.println("线程1成功占用资源2");
                    }
                }
            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized(resources02){
                    System.out.println("线程2占用资源2,请求资源1");

                    try {
                        Thread.sleep(1000);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }

                    synchronized (resources01){
                        System.out.println("线程2成功占用资源1");
                    }
                }
            }
        }).start();

    }
}
