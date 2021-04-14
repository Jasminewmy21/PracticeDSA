package com.practice;

import java.util.Scanner;

/*
    敏感词替换
 */
public class FWordReplace {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入评论：");
        String s = sc.nextLine();

        String replace = s.replace("TMD", "***");
        System.out.println(replace);
    }
}
