package _02选择排序;

/**
 * 比较后最大的放在每轮的后面
 */
public class SelectSort02 {
    public static void main(String[] args) {
        int[] arr = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        selectSort(arr, arr.length);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    private static void selectSort(int[] arr, int n) {
        for (int i = n - 1; i > 0; i--) {
            select(arr, i);
        }
    }

    private static void select(int[] arr, int i) {
        for (int j = 0; j < i; j++) {
            if (arr[j] > arr[i]) {
                swap(arr, j, i);
            }
        }
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
