package com.itheima._20线程同步_Lock锁;

/**
 * 线程类
 */
public class DrawThread extends Thread{
    private Account acc;

    public DrawThread(String name, Account acc) {
        super(name);
        this.acc = acc;
    }

    @Override
    public void run() {
        acc.drawMoney(1000);
    }
}
