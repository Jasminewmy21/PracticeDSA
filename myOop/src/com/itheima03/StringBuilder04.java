package com.itheima03;

import java.util.Scanner;

public class StringBuilder04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("number:");
        String s = sc.nextLine();

        StringBuilder sb = new StringBuilder(s);
        sb.reverse();
        String s1 = sb.toString();
        if (s.equals(s1)) {
            System.out.println("是对称字符串");
        } else {
            System.out.println("不是对称字符串");
        }
    }
}
