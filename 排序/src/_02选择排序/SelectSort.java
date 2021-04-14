package _02选择排序;

/**
 * 把比较后最小的放在每轮的前面
 */
public class SelectSort {
    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 8, 10, 1, 3, 5, 7, 9};
        selectSort(arr, arr.length);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    private static void selectSort(int[] arr, int n) {
        for (int i = 0; i < n - 1; i++) {
            select(arr, i);
        }
    }


    private static void select(int[] arr, int i) {
        for (int j = i + 1; j < arr.length; j++) {
            if (arr[j] < arr[i]) {
                swap(arr, i, j);
            }
        }
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

}
