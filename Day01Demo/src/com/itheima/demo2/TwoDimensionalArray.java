package com.itheima.demo2;
/*
    二维数组
 */
public class TwoDimensionalArray {
    public static void main(String[] args) {
        int[][] arr= new int[3][3];
        System.out.println(arr);//[[I@16b98e56
        /*
          [[I@16b98e56:
          [[表示二维
          I：数组中存储的数据类型
          @:分隔符
          16b98e56：十六进制内存地址

         */

        System.out.println(arr[0]);//[I@7ef20235
        System.out.println(arr[1]);//[I@27d6c5e0
        System.out.println(arr[2]);//[I@4f3f5b24
        /*
            二维数组存储一维数组的时候，存储的是一维数组的内存地址
         */
        System.out.println(arr[0][0]);
        System.out.println(arr[0][1]);
        System.out.println(arr[0][2]);
        System.out.println(arr[1][2]);


    }
}
