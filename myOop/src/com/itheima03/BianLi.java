package com.itheima03;
/*
键盘录入一个字符串，实用程序实现在控制台遍历该字符串

public char charAt(int index)
 */
import java.util.Scanner;

public class BianLi {
    public static void main(String[] args) {
        //1.键盘录入一个字符串，用Scanner实现
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入：");
        String s = sc.nextLine();

        //2.遍历字符串，首先要能够获取到字符串中的每一个字符
        for(int i=0;i<s.length();i++){
            //i:字符串的每一个索引
            char c = s.charAt(i);
            System.out.println(c);
        }
    }
}
