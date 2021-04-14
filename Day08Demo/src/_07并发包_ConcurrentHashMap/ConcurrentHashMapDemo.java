package _07并发包_ConcurrentHashMap;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * 目标:并发包的介绍(面试中的重点的重点)
 *
 * 并发包的来历:
 *      在实际开发中如果不需要考虑线程安全问题,就不需要线程安全考虑,做了反而浪费资源
 *      但是开发中的很多业务需要考虑线程安全问题,此时就必须考虑了
 *      Java为很多业务场景提供了性能优异,且线程安全的并发包,程序员可以选择使用
 *
 *      Map集合中的经典集合:HashMap是[线程不安全]的,但是性能好(并发性的项目中就不能用)
 *          --如果在要求线程安全的业务情况下就不能用这个集合做Map集合,否则业务会崩溃
 *      为了保证线程安全,可以使用Hashtable.注意:线程中加入了计时
 *          --Hashtable是线程安全的Map集合,但是性能较差(已经被淘汰,虽然安全,但是性能差)
 *      为了保证线程安全,再看ConcurrentHashMap(不止线程安全,而且效率高,性能好,最新最好用的线程安全
 *
 * 小结:
 *      HashMap线程不安全但是性能好
 *      Hashtable线程安全,但是性能差,已经被淘汰
 *      ConcurrentHashMap线程安全,性能也好,CAS+局部(synchronized)锁定分段式锁,只锁自己操作的元素位置,综合性能好
 *          建议并发时使用
 */
public class ConcurrentHashMapDemo {
    //演示HashMap在高并发中的不安全性
//    public static Map<String,String> maps = new HashMap<>();
//    public static Map<String,String> maps = new Hashtable<>();//一定到100,0000,线程安全,性能较差
    public static Map<String,String> maps = new ConcurrentHashMap<>();//线程安全,性能好

    public static void main(String[] args) {
        Runnable target = new MyRunnable();
        Thread t1 = new Thread(target, "线程1");
        Thread t2 = new Thread(target, "线程2");
        t1.start();
        t2.start();

        try {
            t1.join();//让t1跑完,主线程不能竞争t1,t2的CPU,但是t1,t2之间还是会抢
            t2.join();//让t2跑完
        } catch (Exception e) {
            e.printStackTrace();
        }

        //等两个线程执行完毕之后去获取集合最终的元素个数: 1000000?
        System.out.println("元素个数:" + maps.size());//结果不到100,0000
    }
}

class MyRunnable implements Runnable{
    @Override
    public void run() {
        long start = System.currentTimeMillis();
        for (int i = 1; i <= 500000; i++) {
            ConcurrentHashMapDemo.maps.put(Thread.currentThread().getName()+i, Thread.currentThread().getName()+i);
        }
        long end = System.currentTimeMillis();
        System.out.println(Thread.currentThread().getName() + "花费时间 = " + (end - start) / 1000.0 + "s");
    }
}


