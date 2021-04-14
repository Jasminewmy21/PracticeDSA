package com.itheima._19线程同步_同步方法;

/**
 * 账户类
 */
public class Account {
    private String cardID;
    private double money;

    public Account() {
    }

    public Account(String cardID, double money) {
        this.cardID = cardID;
        this.money = money;
    }

    public String getCardID() {
        return cardID;
    }

    public void setCardID(String cardID) {
        this.cardID = cardID;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public synchronized void drawMoney(double money) {
        //开始判断取钱逻辑
        //1.先知道谁来取钱
        String name = Thread.currentThread().getName();

        //2.判断余额是否足够
        if (this.money >= money) {
            System.out.println(name + "取钱,余额足够,送出" + money + "元.");
            this.money -= money;
            System.out.println("余额剩下:" + this.money);
        } else {
            System.out.println("余额不足!");
        }
    }
}
