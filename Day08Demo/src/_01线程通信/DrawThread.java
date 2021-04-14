package _01线程通信;

/**
 * 取钱的线程类
 */
public class DrawThread extends Thread {
    private Account acc;

    public DrawThread(String name, Account acc) {
        super(name);
        this.acc = acc;
    }

    @Override
    public void run() {
        //mr ms
        while (true) {
            try {
                Thread.sleep(3000);
            } catch (Exception e) {
                e.printStackTrace();
            }
            acc.drawMoney(10000);
        }
    }
}
