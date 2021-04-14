package _04volatile关键字概述;

/**
 * 目标:并发编程下,多线程访问变量的不可见性问题
 *
 * 引入:
 *      多个线程访问共享变量,会出现一个线程修改变量的值后,其他线程看不到最新值的情况
 *
 * 结论:
 *      并发编程下,多线程修改变量,会出现线程间变量的不可见性
 *
 * 不可见性的原因:
 *      每个线程都有自己的工作内存,线程都是从内存拷贝共享变量的副本值
 *      每个线程是在自己的工作内存中操作共享变量的
 */

public class VolatileDemo01 extends Thread{
    private boolean flag = false;

    @Override
    public void run() {
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
            e.printStackTrace();
        }

        flag = true;
        System.out.println("flag = " + flag);
    }

    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }
}

class VisibilityDemo{
    public static void main(String[] args) {
        //创建子线程,并启动
        VolatileDemo01 t = new VolatileDemo01();
        t.start();

        //主线程
        while(true){
            if(t.isFlag()){
                System.out.println("主线程进入执行");
            }
        }
    }
}