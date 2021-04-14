package _01线程通信;

/**
 * 账户类
 */
public class Account {
    private String accId;
    private double money;

    public Account() {
    }

    public Account(String accId, double money) {
        this.accId = accId;
        this.money = money;
    }

    public String getAccId() {
        return accId;
    }

    public void setAccId(String accId) {
        this.accId = accId;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    //mr ms可能同时抢方法,必须加锁
    public synchronized void drawMoney(double money) {
        String name = Thread.currentThread().getName();

        //1.判断余额是否足够
        try{
            if (this.money >= money) {
                this.money -= money;
                System.out.println(name + "取钱" + money + "元,剩余" + this.money + "元");

                //3.去前后没钱了,唤醒别人,等待自己
                this.notifyAll();
                this.wait();
            }else{
                //余额不足
                this.notifyAll();
                this.wait();
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public synchronized void saveMoney(double money) {
        //b1 b2 b3
        String name = Thread.currentThread().getName();
        try{
            if (this.money > 0) {
                //有钱不存,唤醒别人,等待自己
                this.notifyAll();
                this.wait();
            }else{
                //没钱,存钱
                this.money += money;
                System.out.println(name + "存钱" + money + "元,剩余" + this.money + "元");
                //唤醒别人,等待自己
                this.notifyAll();
                this.wait();
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
