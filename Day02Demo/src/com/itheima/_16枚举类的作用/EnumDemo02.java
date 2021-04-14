package com.itheima._16枚举类的作用;

import jdk.swing.interop.SwingInterOpUtils;

import java.beans.SimpleBeanInfo;

/**
 * 拓展：枚举的API
 */
public class EnumDemo02 {
    public static void main(String[] args) {
        Season s = Season.SPRING;
        System.out.println(s);//SPRING 打名字
        System.out.println("-------------");

        //获取当前类的全部枚举实例:public static Season[] values()
        Season[] ss = Season.values();
        for (int i = 0; i < ss.length; i++) {
            Season s1 = ss[i];
            System.out.println(s1);
        }
        System.out.println("-------------");


        //获取枚举对象的索引：ordinal()
        Season s2 = Season.FALL;
        System.out.println(s2.ordinal());
    }
}
