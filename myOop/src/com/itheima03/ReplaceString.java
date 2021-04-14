package com.itheima03;

import java.util.Scanner;

public class ReplaceString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Comment：");
        String s = sc.nextLine();

        String replace = s.replace("TMD", "***");
        System.out.println(replace);
    }
}
