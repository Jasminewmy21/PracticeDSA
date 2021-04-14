package practiceSort._topK问题;
/**
 * 分治法的快速选择算法:
 * 1.算法需要修改原数组，如果原数组不能修改的话，还需要拷贝一份数组，空间复杂度就上去了。
 *
 * 2.算法需要保存所有的数据。
 * 如果把数据看成输入流的话，使用堆的方法是来一个处理一个，不需要保存数据，只需要保存 k 个元素的最大堆。
 * 而快速选择的方法需要先保存下来所有的数据，再运行算法。当数据量非常大的时候，甚至内存都放不下的时候，就麻烦了。所以当数据量大的时候还是用基于堆的方法比较好。
 *
 */

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Partition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] strs1 = sc.nextLine().split(" ");
        int len1 = strs1.length - 1;
        int k1 = Integer.parseInt(strs1[len1]);
        int[] nums1 = new int[len1];
        for (int i = 0; i < len1; i++) {
            nums1[i] = Integer.parseInt(strs1[i]);
        }
        ArrayList<Integer> res = getLeastNumbers(nums1, k1);
        System.out.print(res.get(0));
        for (int i = 1; i < k1; i++) {
            System.out.print(" " + res.get(i));
        }
    }
    private static Random random = new Random();
    public static ArrayList<Integer> getLeastNumbers(int[] input, int k) {
        ArrayList<Integer> res = new ArrayList<>();
        if (input == null || k <= 0 || k > input.length) {
            return res;
        }
        int left = 0;
        int right = input.length - 1;
        while (true) {
            int index = partition(input, left, right);
            if (index == k - 1) {
                break;
            } else if (index > k - 1) {
                right = index - 1;
            } else {
                left = index + 1;
            }
        }
        for (int i = 0; i < k; i++) {
            res.add(input[i]);
        }
        return res;
    }
    private static int partition(int[] nums, int left, int right) {
        if (left < right) {
            int r = left + 1 + random.nextInt(right - left);
            swap(nums, r, right);
        }
        int pivot = nums[right];
        int i =left;
        for (int j = left; j < right; j++) {
            if (nums[j] < pivot) {
                swap(nums, i, j);
                i++;
            }
        }
        swap(nums, i, right);
        return i;
    }
    private static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
