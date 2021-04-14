package com.practice;

import java.util.Scanner;

/*
    遍历字符串
 */
public class BianLi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入字符串：");
        String str = sc.nextLine();

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            System.out.println(c);
        }
        System.out.println("-------------------");
        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            System.out.println(chars[i]);
        }
    }
}
