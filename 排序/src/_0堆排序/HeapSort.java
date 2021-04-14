package _0堆排序;

/**
 * 大顶堆
 */
public class HeapSort {
    public static void main(String[] args) {
        int tree[] = {2,5,6,7,3,1,10,4};
        int n = tree.length;
        heapSort(tree,n);
        for (int i = 0; i < n; i++) {
            System.out.print(tree[i] + " ");
        }
    }
    private static void heapSort(int[] tree, int len) {
        buildHeap(tree,len);
        int i;
        for (i = len - 1; i >= 0; i--) {
            swap(tree,0,i);
            heapify(tree,i,0);
        }
    }
    private static void buildHeap(int[] tree, int len) {
        int lastNode = len - 1;
        int parent = (lastNode - 1) / 2;
        for (int i = parent; i >= 0; i--) {
            heapify(tree, len, i);
        }
    }
    private static void heapify(int[] tree, int len, int i) {
        if (i >= len) {
            return;
        }
        int c1 = 2 * i + 1;
        int c2 = 2 * i + 2;
        int max = i;
        if (c1 < len && tree[c1] > tree[max]) {
            max = c1;
        }
        if (c2 < len && tree[c2] > tree[max]) {
            max = c2;
        }
        if (max != i) {
            swap(tree,max,i);
            heapify(tree,len,max);
        }
    }

    private static void swap(int[] tree, int i, int j) {
        int temp = tree[i];
        tree[i] = tree[j];
        tree[j] = temp;
    }
}
