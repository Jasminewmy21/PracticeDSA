package _03插入排序;

public class InsertSort02 {
    public static void main(String[] args) {
        int[] arr = {4, 2, 6, 8, 5, 1, 3, 7, 10, 9};
        insertSort(arr, arr.length);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    private static void insertSort(int[] arr, int n) {
        for (int i = 1; i < n; i++) {
            insert(arr,i);
        }
    }

    private static void insert(int[] arr, int i) {
        while (arr[i - 1] > arr[i]) {
            swap(arr, i - 1, i);
            i--;
            if (i == 0) {
                break;
            }
        }
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
