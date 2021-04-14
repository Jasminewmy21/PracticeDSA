package _01冒泡排序;

/**
 * 把一次冒泡和冒泡排序分成两个方法写
 * 把大的冒到后面去 和 把小的冒到后面去一样 只不过比较的时候换下符号
 */
public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {3,6,1,8,10,5,2,3,6};
        bubbleSort(arr,arr.length);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }
    private static void bubbleSort(int[] arr, int n) {
        for (int i = n; i >= 1; i--) {
            bubble(arr,i);
        }
    }
    private static void bubble(int[] arr, int n) {
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] > arr[i+1])
                swap(arr,i,i+1);
        }
    }
    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
