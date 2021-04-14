package _06原子性;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * 目标: 保证原子性操作的方法二: 原子类
 *
 * Class AtomicInteger:
 *      构造方法:
 *          public AtomicInteger()创建一个新的AtomicInteger，初始值为 0
 *          public AtomicInteger(int initialValue)用给定的初始值创建一个新的AtomicInteger。
 *      方法:
 *          public final int get()返回当前值
 *          public final int getAndIncrement()以原子方式将当前值+1,返回的是自增前的值
 *          public final int incrementAndGet()以原子方式将当前值+1,返回的是自增后的值
 *          public final int addAndGet(int delta) 以原子方式将输入的数值与实例中的值(AtomicIntager里的value)相加,并返回结果
 *          public final int getAndSet(int newValue) 以原子方式设置为newValue的值,并返回旧值
 *
 * 小结:
 *      可以使用原子类保证原子性操作,从而实现线程安全
 *      加锁机制的性能较差(synchronized又加悲观锁)
 *      为什么原子类可以保证原子性操作,且性能好,而且线程安全?
 *          底层基于CAS乐观锁机制,每次修改数据不会加锁,等到修改的时候判断有没有别人修改了
 *
 */
public class VolatileAtomicDemo03 {

}

class MyRunnable1 implements Runnable{
    //创建一个Integer更新的原子类AtomicInteger,初始值是0
    private volatile AtomicInteger atomicInteger = new AtomicInteger();

    //一次任务是一个整体,加100
    @Override
    public void run() {
        for (int i = 1; i <= 100; i++) {
            System.out.println("count ==> " + atomicInteger.incrementAndGet());
        }
    }
}
