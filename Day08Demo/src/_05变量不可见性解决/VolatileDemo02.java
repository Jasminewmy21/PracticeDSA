package _05变量不可见性解决;

/**
 * 方法二解决变量不可见性解决: volatile关键字
 *
 * --volatile修饰的变量可以在多线程并发修改下,实现线程间变量的可见性
 * --一旦一个线程修改了volatile修饰的变量,另一个线程可以立即取到最新值
 *
 *
 */
public class VolatileDemo02 {
    public static void main(String[] args) {
        Visibility1 t = new Visibility1();
        t.start();

        while(true){
            if(t.isFlag()){
                System.out.println("main线程执行");
            }
        }
    }
}

class Visibility1 extends Thread{
    private volatile boolean flag = false;

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
