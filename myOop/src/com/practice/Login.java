package com.practice;

import java.util.Scanner;

/*
    用户登录
 */
public class Login {
    public static void main(String[] args) {
        String username = "KrisWu";
        String password = "1106";

        for (int i = 1; i <= 3; i++) {
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入用户名：");
            String username1 = sc.nextLine();
            System.out.println("请输入密码：");
            String password1 = sc.nextLine();

            if (username.equals(username1) && password.equals(password1)) {
                System.out.println("登陆成功");
            } else {
                if (i == 3) {
                    System.out.println("登录次数用完，请明天再试");
                } else {
                    System.out.println("登陆失败,还剩" + (3 - i) + "次机会");
                }
            }
        }
    }
}
