package com.itheima._20线程同步_Lock锁;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * 账户类
 */
public class Account {
    private String accId;
    private double money;
    private final Lock lock = new ReentrantLock();

    public void drawMoney(double money) {
        String name = Thread.currentThread().getName();
        lock.lock();
        try {
            if (this.money >= money) {
                System.out.println(Thread.currentThread().getName() + "取钱" + money + "元");
                this.money -= money;
                System.out.println("剩余" + this.money + "元");
            } else {
                System.out.println("余额不足,取钱失败");
            }
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            lock.unlock();
        }
    }

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

    public Lock getLock() {
        return lock;
    }
}
