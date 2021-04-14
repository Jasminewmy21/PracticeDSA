package com.practice;

import java.util.Scanner;

/*
    判断是否是对称字符串
 */
public class SymmetricString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入字符串：");
        String s = sc.nextLine();

        //将字符串封装成StringBuilder对象，目的是调用SB的reverse方法
        StringBuilder sb = new StringBuilder(s);

        sb.reverse();
        String reverseS = sb.toString();

        if(s.equals(reverseS)){
            System.out.println("对称字符串");
        }else{
            System.out.println("非对称字符串");
        }
    }
}
