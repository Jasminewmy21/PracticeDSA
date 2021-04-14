package com.itheima.demo2;
/*
    二维数组能否存入提前创建好的一维数组？
 */
public class TwoDimensionalArray2 {
    public static void main(String[] args) {
        int[] arr1= {11,22,33};
        int[] arr2= {11,22,33};
        int[] arr3= {11,22,33,44};
        System.out.println(arr1);//[I@16b98e56
        System.out.println(arr2);//[I@7ef20235
        System.out.println(arr3);//[I@27d6c5e0

        int[] arr4={1,2,3,4,5};//[I@4f3f5b24

        int[][] arr = new int[3][3];
        arr[0] = arr1;
        arr[1] = arr2;
        arr[2] = arr4;
        System.out.println(arr[2][3]);

        System.out.println(arr[0]);//[I@16b98e56
        System.out.println(arr[1]);//[I@7ef20235
        System.out.println(arr[2]);//[I@27d6c5e0
    }
}
