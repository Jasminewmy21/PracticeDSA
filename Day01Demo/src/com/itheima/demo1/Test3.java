package com.itheima.demo1;

import java.util.Scanner;

/*
    design a method which can print odds between n and m
 */
public class Test3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please input the range of numbers:");
        int n = sc.nextInt();
        int m = sc.nextInt();

        printOdds(n, m);
    }

    private static void printOdds(int n, int m) {

        if (n > m) {
            System.out.println("The range you input is wrong.");
            return;//可以用于结束方法，也就是将方法从占内存中弹出去，该过程称之为弹栈
        }

        System.out.println("The odds between " + n + " and " + m + ":");
        int index = 0;
        for (int i = n; i <= m; i++) {
            if (i % 2 == 1) {
                System.out.print(i + " ");
                index++;
                if (index == 10) {
                    System.out.println();
                    index = 0;
                }
            }
        }
    }
}
