package _0堆排序;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class WriteHeap347 {
    private static Map<Integer, Integer> map = new HashMap<>();

    public static void main(String[] args) {
        int[] nums = {-1, 1, 4, -4, 3, 5, 4, -2, 3, -1};
        int k = 3;
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        Set<Map.Entry<Integer, Integer>> entries = map.entrySet();

        int[] res = topKFrequent(nums, k);
        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i] + " ");
        }
    }

    public static int[] topKFrequent(int[] nums, int k) {
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        int[] heap = new int[k];
        Iterator it = map.keySet().iterator();
        int i = 0;
        while (it.hasNext()) {
            if (i < k) {
                heap[i] = (Integer) it.next();
                i++;
            } else if (i == k) {
                buildHeap(heap, k);
            } else {
                for (i = k; i < map.size(); i++) {
                    int key = (Integer) it.next();
                    if (map.get(key) > map.get(heap[0])) {
                        heap[0] = key;
                        buildHeap(heap, k);
                    }
                }
            }
        }
        return heap;
    }

    private static void buildHeap(int[] heap, int n) {
        int last = n - 1;
        int parent = (last - 1) / 2;
        for (int i = parent; i >= 0; i--) {
            heapify(heap, n, i);
        }
    }

    private static void heapify(int[] heap, int n, int i) {
        if (i >= n) return;

        int c1 = i * 2 + 1;
        int c2 = i * 2 + 2;
        int min = i;
        if (c1 < n && map.get(heap[c1]) < map.get(heap[min])) {
            min = c1;
        }
        if (c1 < n && map.get(heap[c1]) < map.get(heap[min])) {
            min = c2;
        }
        if (min != i) {
            swap(heap, i, min);
            heapify(heap, n, min);
        }
    }

    private static void swap(int[] heap, int i, int j) {
        int temp = heap[i];
        heap[i] = heap[j];
        heap[j] = temp;
    }
}

