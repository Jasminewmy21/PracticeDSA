package _01冒泡排序;


/**
 * 把小的冒到前面 和 把大的冒到前面一样的 只不过比较的时候符号变化
 */
public class BubbleSort02 {
    public static void main(String[] args) {
        int[] arr = {10,9,8,7,6,5,4,3,2,1};
        bubbleSort02(arr, arr.length);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    private static void bubbleSort02(int[] arr, int n) {
        for (int i = 0; i < n - 1; i++) {
            bubble02(arr,i);
        }
    }


    private static void bubble02(int[] arr, int n) {
        for (int i = arr.length - 1; i > n; i--) {
            if (arr[i] < arr[i - 1])
                swap(arr, i - 1, i);
        }
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
