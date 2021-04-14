package _01线程通信;

/**
 * 存钱的线程类
 */
public class SaveThread extends Thread {
    private Account acc;

    public SaveThread(String name, Account acc) {
        super(name);
        this.acc = acc;
    }

    @Override
    public void run() {

        while(true){
            //存钱
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            acc.saveMoney(10000);
        }
    }
}
