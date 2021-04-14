package com.itheima._10排序算法冒泡_选择_排序;

/**
 * 选择排序:
 *      从当前位置开始找出后面的较小值与该位置交换
 *      数组: int[] arr = {5,1,3,2}
 *
 * 实现思路:
 *      1.控制选择几轮:数组的长度-1
 *      2.控制每轮从当前位置开始比较几次
 *
 *      i      次数      控制选择几轮:数组的长度-1
 *      0       3
 *      1       2
 *      2       1
 *
 * 小结:
 *      从[当前位置]开始找出后面的较小值与该位置交换
 *      控制选择几轮:数组的长度-1
 *      以[当前位置]为基准,从下一个元素开始遍历寻找出较小值与当前位置交换
 *
 */
public class SelectSort {
    public static void main(String[] args) {
        int[] arr = {5,1,3,2};
        arr = selectSort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    private static int[] selectSort(int[] arr) {
        for(int i=0; i< arr.length - 1; i++) {

            for(int j=i+1; j<arr.length; j++){
                if(arr[j] < arr[i]) {
                    int currentDate = arr[i];
                    arr[i] = arr[j];
                    arr[j] = currentDate;
                }
            }
        }
        return arr;
    }

}
