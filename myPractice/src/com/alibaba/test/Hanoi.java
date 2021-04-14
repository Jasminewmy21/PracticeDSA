package com.alibaba.test;

/**
 * 汉诺塔递归
 */
public class Hanoi {
    public static void main(String[] args) {

        hanoi(3,'A','B','C');
    }

    private static void hanoi(int n, char a, char b, char c) {
        if (n == 1) {
            System.out.println(a + "--->" + c);
            return;
        }
        hanoi(n-1, a, c, b);
        System.out.println(a + "--->" + c);
        hanoi(n-1, b, a, c);
    }

}
