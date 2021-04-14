package _05变量不可见性解决;

/**
 * 目标:并发编程下,多线程访问变量的不可见性问题的解决
 *
 * 并发编程下,多线程修改变量,会出现线程间变量的不可见性
 *
 * 解决方法:
 *      1.加锁
 *          --每次加锁会清空线程自己的工作内存,从新读取内存最新值
 *      2.volatile关键字
 *          --volatile修饰的变量可以在多线程并发修改下,实现线程间变量的可见性
 *          --一旦一个线程修改了volatile修饰的变量,另一个线程可以立即取到最新值
 *
 */
public class VolatileDemo01 {
    public static void main(String[] args) {
        Visibility t = new Visibility();
        t.start();

        while(true){
            synchronized (VolatileDemo01.class){
                if(t.isFlag()){
                    System.out.println("main线程执行");
                }
            }
        }
    }
}

class Visibility extends Thread{
    private boolean flag = false;

    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }

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
}
