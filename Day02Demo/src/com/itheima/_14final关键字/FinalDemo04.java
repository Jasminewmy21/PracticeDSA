package com.itheima._14final关键字;

/**
 * 目标:final修饰实例成员变量(了解,用不到)
 *
 * final修饰变量总规则:变量有且仅能被赋值一次
 *
 * 拓展:
 * --final修改实例成员变量可以在哪些地方赋值1次
 * 1.定义的时候赋值一次
 * 2.可以在实例代码块中赋值一次
 * 3.可以在每个构造器中赋值一次
 */
public class FinalDemo04 {
    private final String NAME = "Oxford";
    private final String NAME1;
    private final String NAME2;

    public FinalDemo04() {
        NAME2 = "Stanford";
    }

    public FinalDemo04(String x) {
        NAME2 = "Ford";
    }

    {
        //可以在实例代码块中赋值一次
        NAME1 = "Harvard";
    }
    public static void main(String[] args) {
        FinalDemo04 f = new FinalDemo04();
        System.out.println(f.NAME);
//        f.name = "Cambridge";//报错,第一次赋值
    }
}
