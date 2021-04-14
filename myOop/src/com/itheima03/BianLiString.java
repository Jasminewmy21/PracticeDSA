package com.itheima03;

import java.util.Scanner;

/*
    JavaBean
 */
public class BianLiString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("String:");
        String s = sc.nextLine();

        //遍历方法一
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            System.out.println(c);
        }
        System.out.println("-----------------");

        //遍历方法二
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            System.out.print(chars[i] + "  ");
        }


    }
}
