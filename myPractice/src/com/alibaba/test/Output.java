package com.alibaba.test;

import java.util.Scanner;

/*
给出一个正整数N和长度L，找出一段长度大于等于L的连续非负整数，他们的和恰好为N。
答案可能有多个，我我们需要找出长度最小的那个。
例如 N = 18 L = 2：
5 + 6 + 7 = 18
3 + 4 + 5 + 6 = 18
都是满足要求的，但是我们输出更短的 5 6 7
 */
public class Output {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入正整数N：");
        int n = sc.nextInt();
        System.out.println("请输入长度L：");
        int l = sc.nextInt();

    }
}
