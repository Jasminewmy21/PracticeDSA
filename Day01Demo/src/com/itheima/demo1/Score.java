package com.itheima.demo1;

import java.util.Scanner;

/*
    评委打分
 */
public class Score {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入评委人数：");
        int size = sc.nextInt();
        int[] arr = new int[size];

        for (int i = 0; i < arr.length; i++) {
            System.out.println("请输入第" + (i + 1) + "个评委的打分：");
            int score = sc.nextInt();
            if (score >= 0 && score <= 100) {
                arr[i] = score;
            } else {
                System.out.println("你输入的分数有误，请重新输入！");
                i--;
            }
        }

        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }

        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (min>arr[i]) {
                min = arr[i];
            }
        }

        int sum = 0;
        for (int j : arr) {
            sum += j;
        }


        int avg;
        avg = (sum - max - min) / (size - 2);
        System.out.println("平均分为：" + avg);
    }
}
