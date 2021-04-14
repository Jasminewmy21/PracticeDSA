package _04归并排序;

/**
 * 归并排序:
 * 二分思想
 * T:O(nlogn)
 * S:O(1)
 */
public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {2, 8, 9, 10, 4, 5, 6, 7};
        merge(arr, 0, 4, 7);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    private static void merge(int[] arr, int l, int m, int r) {
        int leftS = m - l;
        int rightS = r - m + 1;
        int[] left = new int[leftS];
        int[] right = new int[rightS];
        int s = 0, e = 0, k = l;

        for (int i = l; i < m; i++) {
            left[i - l] = arr[i];
        }
        for (int i = m; i <= r; i++) {
            right[i - m] = arr[i];
        }

        while (s < leftS && e < rightS) {
            if (left[s] < right[e]) {
                arr[k++] = left[s++];
            } else {
                arr[k++] = right[e++];
            }
        }
        while (s < leftS) {
            arr[k++] = left[s++];
        }
        while (e < rightS) {
            arr[k++] = right[e++];
        }
    }
}
