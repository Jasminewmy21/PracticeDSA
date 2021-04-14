package com.itheima._18线程同步_同步代码块;



/**
 * 取钱线程:为了创建取钱线程对象
 */
public class DrawThread extends Thread{
    //定义一个成员变量接收账户对象
    private Account acc;

    public DrawThread(String name, Account acc) {
        super(name);
        this.acc = acc;
    }

    @Override
    public void run() {
        acc.drawMoney(10000);
    }
}
