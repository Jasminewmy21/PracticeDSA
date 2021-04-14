package practiceSort._topK问题;

import java.util.ArrayList;

/**
 * 手写堆
 * poll会下沉恢复堆有序
 * （从堆顶往下一个个比较，相当于把堆顶往下沉，然后到合适位置，堆顶下沉只会赋值一次，并不是下沉的时候比较交换）
 * offer会上升恢复堆有序
 * （从堆底往上一个个比较，相当于把堆底往上浮，堆底上浮只会赋值一次到合适位置，并不是上浮的时候比较交换）
 * <p>
 * 如果手写堆实现的话，仅仅只需要将堆顶元素替换再下沉，就没有了上升恢复堆有序的环节。
 * <p>
 * 如果不上浮,最后返回的ArrayList不是有序的
 */
public class WriteBigHeap {
    public static void main(String[] args) {
        int[] input = {4, 5, 1, 6, 2, 7, 3, 8};
        int k = 4;
        ArrayList<Integer> res = getLeastNumbers(input, k);
        for (int num : res) {
            System.out.println(num);
        }
    }

    public static ArrayList<Integer> getLeastNumbers(int[] input, int k) {
        ArrayList<Integer> res = new ArrayList<>();
        if (k <= 0 || k > input.length || input == null) {
            return res;
        }

        int[] heap = new int[k];
        for (int i = 0; i < k; i++) {
            heap[i] = input[i];
        }
        buildHeap(heap);
        for (int i = k; i < input.length; i++) {
            if (input[i] < heap[0]) {
                heap[0] = input[i];
                heapify(heap, 0);
            }
        }
        for (int num : heap) {
            res.add(num);
        }
        return res;
    }

    private static void buildHeap(int[] heap) {
        int lastNode = heap.length - 1;
        int parent = (lastNode - 1) / 2;
        while (parent >= 0) {
            heapify(heap, parent--);
        }
    }

    private static void heapify(int[] heap, int i) {
        int len = heap.length;
        if (i >= len) {
            return;
        }
        int c1 = i * 2 + 1;
        int c2 = i * 2 + 2;
        int max = i;
        if (c1 < len && heap[c1] > heap[max]) {
            max = c1;
        }
        if (c2 < len && heap[c2] > heap[max]) {
            max = c2;
        }
        if (max != i) {
            swap(heap, max, i);
            heapify(heap, max);
        }
    }

    private static void swap(int[] heap, int i, int j) {
        int temp = heap[i];
        heap[i] = heap[j];
        heap[j] = temp;
    }
}

