package com.practice;

import java.util.Scanner;

/*
    统计大写/小写/数字出现的个数
 */
public class CountNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入字符串：");
        String str = sc.nextLine();

        int bigCount = 0;
        int smallCount = 0;
        int numCount = 0;
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c >= 'A' && c <= 'Z') {
                bigCount++;
            } else if (c >= 'a' && c <= 'z') {
                smallCount++;
            } else if (c >= '0' && c <= '9') {
                numCount++;
            }
        }
        System.out.println("大写字母个数："+bigCount);
        System.out.println("小写字母个数："+smallCount);
        System.out.println("数字个数："+numCount);
    }
}
