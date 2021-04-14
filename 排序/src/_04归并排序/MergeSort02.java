package _04归并排序;

/**
 * 如果不是两段按顺序的呢? 分治(divide and conquer)思想
 */
public class MergeSort02 {
    public static void main(String[] args) {
        int[] arr = {6, 8, 10, 9, 4, 5, 2, 7};
        mergeSort(arr, 0, 7);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    private static void mergeSort(int[] arr, int l, int r) {
        if (l == r) return;
        else {
            int m = (l + r) / 2;
            mergeSort(arr, l, m);
            mergeSort(arr, m + 1, r);
            merge(arr, l, m + 1, r);
        }

    }

    private static void merge(int[] arr, int l, int m, int r) {
        int leftSize = m - l;
        int rightSize = r - m + 1;
        int[] left = new int[leftSize];
        int[] right = new int[rightSize];

        for (int p = l; p < m; p++) {
            left[p - l] = arr[p];
        }

        for (int p = m; p <= r; p++) {
            right[p - m] = arr[p];
        }

        int i = 0, j = 0, k = l;
        while (i < leftSize && j < rightSize) {
            if (left[i] < right[j]) {
                arr[k++] = left[i++];
            } else {
                arr[k++] = right[j++];
            }
        }
        while (i < leftSize) {
            arr[k++] = left[i++];
        }
        while (j < rightSize) {
            arr[k++] = right[j++];
        }
    }
}

