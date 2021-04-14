package com.itheima.demo1;

import java.util.Scanner;

/*
    判断奇偶
 */
public class Test2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please input a number:");
        int num = sc.nextInt();
        parity(num);
    }

    private static void parity(int num) {
        if (num % 2 == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
    }
}
