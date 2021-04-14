package _01线程通信;

/**
 * 目标: 线程通信(要懂原理,几乎不用,以后会有框架封装)
 *
 * 线程通信:多个线程因为在同一个进程中,所以互相通信比较容易的
 *
 * 线程通信的经典案例:生产者与消费者问题
 *      生产者负责生产商品,消费者负责消费商品
 *      生产不能过剩,消费不能没有
 *
 * 模拟一个案例:
 *      小明和小红有一个共同账户:共享资源
 *      有三个爸爸给他们存钱
 *
 *      模型:小明小红去取钱,如果有钱就取出,然后等待自己,唤醒他们3个爸爸们来存钱
 *      爸爸们来存钱,如果发现有钱就不存,没钱就存钱,然后等待自己,唤醒孩子们来取钱
 *
 *      分析:
 *          生产者线程:爸爸1,爸爸2,爸爸3
 *          消费者线程:小明,小红
 *          共享资源:账户对象
 *
 *      注意:线程通信一定是多个线程在操作同一个资源才需要进行通信
 *          线程通信必须先保证线程安全,否则毫无意义,代码也会报错
 *
 *      线程通信的(Object类提供的)核心方法:
 *          public void wait():让当前线程进入到等待状态,此方法必须[锁对象]调用
 *          public void notify():唤醒当前锁对象上等待状态的某个线程,此方法必须[锁对象]调用
 *          public void notifyAll():唤醒当前锁对象上等待状态的全部线程,此方法必须[锁对象]调用
 *
 *
 *
 */
public class ThreadCommunication {
    public static void main(String[] args) {
        //1.创建一个共享账户
        Account icbc = new Account("111",0);

        //2.创建取钱线程
        new DrawThread("ms",icbc).start();
        new DrawThread("mr",icbc).start();

        //3.创建存钱线程
        new SaveThread("b1",icbc).start();
        new SaveThread("b2",icbc).start();
        new SaveThread("b3",icbc).start();

    }
}
