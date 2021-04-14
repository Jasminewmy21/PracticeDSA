package com.itheima03;

import java.util.Scanner;

/*
public char[] toCharArray()
 */
public class BianLi02 {
    public static void main(String[] args) {
        //1.键盘录入一个字符串，用Scanner实现
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入：");
        String s = sc.nextLine();

        //2.将字符串拆分为字符数组
        char[] chars = s.toCharArray();

        //2.遍历字符串，首先要能够获取到字符串中的每一个字符
        for(int i=0;i<chars.length;i++){
            System.out.println(chars[i]);
        }
    }
}
