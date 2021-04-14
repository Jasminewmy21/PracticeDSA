package com.practice;

import java.util.Scanner;

/*
    拼接字符串
 */
public class PinJieString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入数组数据：");
        int num = 10;
        int[] arr = new int[num];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        String s = arrayToString(arr);
        System.out.println(s);
    }

    private static String arrayToString(int[] arr) {
        StringBuilder sb = new StringBuilder("[");

        for (int i = 0; i < arr.length; i++) {
            if(i == arr.length -1){
                sb.append(arr[i]).append("]");
            }else{
                sb.append(arr[i]).append(",");
            }
        }

        return sb.toString();

    }
}
