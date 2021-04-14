package com.itheima._10异常的强大之处;

import java.util.Scanner;

/**
 * 异常的作用:
 * 1.可以处理代码问题,防止程序出现异常后死亡
 * 2.提高了程序的健壮性和安全性
 */
public class Demo {
    public static void main(String[] args) {
        //输入合法的年龄为止
        while(true) {
            try {
                Scanner sc = new Scanner(System.in);
                System.out.println("请输入年龄:");

                int age = sc.nextInt();
                System.out.println("年龄是:" + age);
                break;
            } catch (Exception e) {
                System.err.println("年龄不合法");
            }
        }
    }
}
