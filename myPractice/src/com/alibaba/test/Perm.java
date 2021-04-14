package com.alibaba.test;

/**
 * 全排列的代码
 */
public class Perm {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3,4};
        perm(arr,0,3);
    }

    private static void perm(int[] arr, int start, int end) {
        if (start == end) {
            printArr(arr,end+1);
            return;
        }
        for (int i = start; i <= end; i++) {
            swap(arr,i,start);
            perm(arr,start+1,end);
            swap(arr,i,start);
        }
    }

    private static void printArr(int[] arr, int end) {
        for (int i = 0; i < end; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
