package _02线程池;

import java.util.Arrays;

/**
 * 线程池:其实就是一个容纳多个线程的容器,其中的线程可以反复的使用,
 *      省去了频繁创建和销毁线程对象的操作,无需反复创建线程而消耗过多资源
 *
 * 为啥要用线程池:
 *      合理利用线程能带来三个好处:
 *      1.降低资源消耗
 *          --减少了创建和销毁线程的次数,每个工作线程都可以
 *            被重复利用,可执行多个任务
 *
 *      2.提高响应速度
 *          --不需要频繁的创建线程,如果有
 *            线程任务可以直接用,不会出现系统将死
 *      3.提高线程的可管理性(线程池可以约束系统最多只能有多少个线程,
 *        不会因为线程过多而死机)
 *
 * 线程池的核心思想:线程复用,同一个线程可以被重复使用,来处理多个任务
 */
public class ThreadPoolsDemo01 {
    public static void main(String[] args) {
        int min = Integer.MAX_VALUE;
        System.out.println(min);
        char[] cs = new char[10];
        new String(cs);
    }
}
