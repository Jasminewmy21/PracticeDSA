package com.practice;

import java.util.Scanner;

/*
   手机号屏蔽 字符串截取
 */
public class PhoneNumPingBi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入手机号：");
        String phoneNum = sc.nextLine();

        String s1 = phoneNum.substring(0, 3);
        String s2 = "****";
        String s3 = phoneNum.substring(7);

        System.out.println(s1 + s2 + s3);

    }
}
