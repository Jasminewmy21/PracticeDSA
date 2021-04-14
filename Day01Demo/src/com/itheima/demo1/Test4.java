package com.itheima.demo1;

/*
    方法重载
 */
public class Test4 {
    public static void main(String[] args) {
        compare(4, 9);
        compare(200,152);
    }

    private static boolean compare(int a, int b) {
        return a == b;
    }

    private static boolean compare(byte a, byte b) {
        return a == b;
    }

    private static boolean compare(short a, short b) {
        return a == b;
    }

    private static boolean compare(long a, long b) {
        return a == b;
    }
}
