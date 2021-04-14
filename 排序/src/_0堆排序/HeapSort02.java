package _0堆排序;
/*
最小堆
 */
public class HeapSort02 {
    public static void main(String[] args) {
        int[] nums = {12,2,10,8,9,2,1};
        int len = nums.length;
        heapSort(nums,len);
        for (int j = 0; j < len; j++) {
            System.out.println(nums[j]);
        }
    }

    private static void heapSort(int[] nums, int len) {
        buildHeap(nums,len);
        int i;
        for (i = 1; i < len; i++) {
            swap(nums,i, len - 1);
            heapify(nums,i,len - 1);
        }
    }


    private static void buildHeap(int[] tree, int len) {
        int lastNode = len - 1;
        int parent = (lastNode - 1) / 2;
        for (int i = parent; i >= 0; i--) {
            heapify(tree,len,i);
        }
    }


    private static void heapify(int[] tree, int len, int i) {
        if ( i >= len) return;
        int c1 = 2 * i + 1;
        int c2 = 2 * i + 2;
        int min = i;
        if (c1 < len && tree[c1] < tree[min]) {
            min = c1;
        }
        if (c2 < len && tree[c2] < tree[min]) {
            min = c2;
        }
        if (min != i) {
            swap(tree,min,i);
            heapify(tree,len,min);
        }
    }

    private static void swap(int[] tree, int i, int j) {
        int temp = tree[i];
        tree[i] = tree[j];
        tree[j] = temp;
    }

}
