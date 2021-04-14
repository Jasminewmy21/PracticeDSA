package _02线程池;
/**
 * 目标:创建一个线程池
 *
 * 用Callable任务对象给线程池执行
 *
 * 小结:
 *      Callable做线程池的任务可以得到线程执行的结果
 *
 */

import java.util.concurrent.*;

public class ThreadPoolsDemo03 {
    public static void main(String[] args) {
        //1.创建线程池,指定线程的固定数量为3
        ExecutorService pools = Executors.newFixedThreadPool(3);

        //FutureTask实现RunnableFuture接口,RunnableFuture实现Runnable,Future接口,所以Future是FutureTask的实现类
        //2.提交Callable线程任务的对象后返回一个FutureTask对象,用父类Future接
        Future<String> t1 = pools.submit(new MyCallable(100));
        Future<String> t2 = pools.submit(new MyCallable(200));
        Future<String> t3 = pools.submit(new MyCallable(300));
        Future<String> t4 = pools.submit(new MyCallable(400));

        //3.获取线程池执行的任务的结果
        try {
            String rs1 = t1.get();
            String rs2 = t2.get();
            String rs3 = t3.get();
            String rs4 = t4.get();
            System.out.println(rs1);
            System.out.println(rs2);
            System.out.println(rs3);
            System.out.println(rs4);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

class MyCallable implements Callable {

    //使用线程池计算1-100,1-200,1-300的和返回
    private int n;

    public MyCallable(int n) {
        this.n = n;
    }

    @Override
    public String call() throws Exception {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return Thread.currentThread().getName() + "执行的结果是" + sum;
    }
}