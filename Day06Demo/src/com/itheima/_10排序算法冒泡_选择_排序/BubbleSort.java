package com.itheima._10排序算法冒泡_选择_排序;

import javax.swing.*;

/**
 * 冒泡泡排序的实现核心:
 *      1.确定总共需要冒几轮:数组的长度-1
 *      2.每轮两两比较几次
 *          i(轮数)     次数      次数的规则:数组长度-1-i
 *           0          3
 *           1          2
 *           2          1
 *
 * 冒泡算法的核心点:每次两两比较找出当前最大值冒出到当前最后面即可
 */
public class BubbleSort {
    public static void main(String[] args) {
        int[] arrays = {8, 7, 6, 5, 4, 3, 2, 1};
        arrays = bubbleSort(arrays);
        for (int array : arrays) {
            System.out.println(array);
        }
    }

    private static int[] bubbleSort(int[] arrays) {
        for (int i = 0; i < arrays.length - 1; i++) {
            for (int j = 0; j < arrays.length - 1 - i; j++) {
                if (arrays[j] > arrays[j + 1]) {
                    int temp = arrays[j];
                    arrays[j] = arrays[j + 1];
                    arrays[j + 1] = temp;
                }
            }
        }
        return arrays;
    }
}
