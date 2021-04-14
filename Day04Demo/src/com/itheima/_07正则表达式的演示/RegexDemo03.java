package com.itheima._07正则表达式的演示;

import java.util.Scanner;

public class RegexDemo03 {
    public static void main(String[] args) {
//        checkEmail();
//        checkTel();
        checkPhone();
    }

    private static void checkPhone() {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入电话号码：");
        String phone = sc.nextLine();//按shift+F6 直接更改所有叫这个名字的地方

        if(phone.matches("0\\d{2,5}-?\\d{5,10}")){
            System.out.println("电话号码合法");
        }else{
            System.err.println("电话号码不合法");//err打出来是红色
        }
    }

    private static void checkTel() {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入手机号码：");
        String tel = sc.nextLine();

        if(tel.matches("1[3,9]\\d{9}")){
            System.out.println("手机号码合法");
        }else{
            System.err.println("手机号码不合法");//err打出来是红色
        }
    }

    public static void checkEmail() {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入邮箱：");
        String email = sc.nextLine();

        //...@qq.com
        //...@163.com
        //...@gmail.com
        if(email.matches("\\w+@\\w{2,10}(\\.\\w{2,10}){1,2}")){
            System.out.println("邮箱合法");
        }else{
            System.err.println("邮箱不合法");//err打出来是红色
        }

    }
}
