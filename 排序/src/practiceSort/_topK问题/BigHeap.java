package practiceSort._topK问题;

import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * 维护一个大顶堆
 * 使用的也是库函数中的优先队列数据结构: PriorityQueue
 * (java的优先队列默认是小顶堆,重写comparator比较器的参数,变成大顶堆)
 * T: O(nlogk), 入栈和出栈时间复杂度为O(logk),有n个元素
 * S: O(k),建了一个大小为k的堆
 *
 * poll下沉恢复堆有序,offer上浮恢复堆有序
 */
public class BigHeap {
    public static void main(String[] args) {
        int[] arr = {4, 5, 1, 6, 2, 7, 3, 8, 4};
        int k = 4;
        ArrayList<Integer> res = getLeastNumbers2(arr, k);
        System.out.print(res.get(0));
        for (int i = 1; i < k; i++) {
            System.out.print(" " + res.get(i));
        }
    }

    private static ArrayList<Integer> getLeastNumbers2(int[] nums, int k) {
        ArrayList<Integer> res = new ArrayList<>();
        if (k <= 0 || k > nums.length || nums == null) {
            return res;
        }
        Queue<Integer> heap = new PriorityQueue<>(k, (i1, i2) -> Integer.compare(i2, i1));

        for (int num : nums) {
            //堆是空的/堆元素个数<k/当前num<堆顶元素,才能入栈
            if (heap.isEmpty() || heap.size() < k || num < heap.peek()) {
                heap.offer(num);
            }
            if (heap.size() > k) {
                heap.poll();//删除堆顶最大元素
            }
        }
        //将堆里的元素存到res集合
        for (int num : heap) {
            res.add(num);
        }
        return res;
    }

}
