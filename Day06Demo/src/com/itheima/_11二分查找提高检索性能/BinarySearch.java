package com.itheima._11二分查找提高检索性能;

/**
 * 二分查找:
 *      正常查找:从第0个索引开始遍历,一个一个往后找,比较耗时
 *      二分查找:前提: 数组要是按照顺序排列好的
 *
 *  流程:
 *      定义一个方法,记录开始的索引位置和结束的索引位置
 *      取出中间索引位置的值,拿元素与中间位置的值进行比较,如果小于中间值,结束位置 = 中间索引 - 1;
 *      取出中间索引位置的值,拿元素与中间位置的值进行比较,如果大于中间值,开始位置 = 中间索引 + 1;
 *      循环正常执行的条件是:开始位置索引<=结束位置索引,否则说明寻找完毕都没有该元素,返回-1
 */
public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {2,10,15,30,40,55,63,83,99,100};
        int number = 99;
        int index = binarySearch(arr, number);
        System.out.println(index);
    }

    public static int binarySearch(int[] arr, int number) {
        int start = 0;
        int end = arr.length - 1;

        //定义一个循环不断地折中寻找
        while(start <= end) {
            //定位到中间元素地索引
            int middleIndex = (start + end) / 2;

            //那当前元素与中间元素进行比较
            if(number > arr[middleIndex]) {
                start = middleIndex + 1;
            }else if (number < arr[middleIndex]) {
                end = middleIndex - 1;
            }else {
                return middleIndex;
            }
        }
        return -1;
    }
}
