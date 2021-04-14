package _11并发包_Exchanger;

import java.util.concurrent.Exchanger;
import java.util.concurrent.TimeUnit;

/**
 * Exchanger(交换者)
 */
public class ExchangerDemo {
    public static void main(String[] args) {
        Exchanger<String> exchanger = new Exchanger();
        new Boy(exchanger).start();
        new Girl(exchanger).start();
    }
}

class Boy extends Thread{
    private Exchanger<String> exchanger;

    public Boy(Exchanger exchanger) {
        this.exchanger = exchanger;
    }

    @Override
    public void run() {
        try {
            System.out.println("男孩做好自己的信物:🔒");
            //交换结果:送出自己的东西
//            String rs = exchanger.exchange("🔒");
            String rs = exchanger.exchange("🔒",5, TimeUnit.SECONDS);//等待结束没等到,就抛异常:TimeoutException
            System.out.println("男孩收到:" + rs);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}

class Girl extends Thread{
    private Exchanger<String> exchanger;

    public Girl(Exchanger exchanger) {
        this.exchanger = exchanger;
    }

    @Override
    public void run() {
        try {
            System.out.println("女孩做好自己的信物:🔑");
            Thread.sleep(6000);
            //交换结果:送出自己的东西
            String rs = exchanger.exchange("🔑");
            System.out.println("女孩收到:" + rs);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}