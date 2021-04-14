package _03插入排序;

/**
 * 插入排序:分为排序好的,和没有排序的
 */
public class InsertSort {
    public static void main(String[] args) {
        int[] arr = {4,2,6,8,5,1,3,7,10,9};
        insertSort(arr,arr.length);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    private static void insertSort(int[] arr, int n) {
        for (int i = 1; i < n; i++) {
            insert(arr,i);
        }
    }

    private static void insert(int[] arr, int n) {
        int key = arr[n];
        int i = n;
        while (arr[i - 1] > key) {
            arr[i] = arr[i - 1];
            i--;
            if (i == 0) {
                break;
            }
        }
        arr[i] = key;
    }
}
