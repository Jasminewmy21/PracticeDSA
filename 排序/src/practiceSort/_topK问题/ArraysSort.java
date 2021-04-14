package practiceSort._topK问题;

import java.util.Arrays;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * 直接用java函数库里面的sort排序,sort排序基于快排,为Tim Sort
 * T: O(nlogn), 时间复杂度,即为排序的时间复杂度
 * S: O(logn), 排序需额外的空间复杂度O(logn)
 *
 * 测试用例: 4 5 1 6 2 7 3 8 4
 */
public class ArraysSort {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        String[] strs = str.split(" ");
        int k = Integer.parseInt(strs[strs.length - 1]);
        int len = strs.length - 1;
        int[] nums = new int[len];
        for (int i = 0; i < len; i++) {
            nums[i] = Integer.parseInt(strs[i]);
        }
        getLeastNumbers(nums, k);
        System.out.print(nums[0]);
        for (int i = 1; i < k; i++) {
            System.out.print(" " + nums[i]);
        }
    }
        private static int[] getLeastNumbers ( int[] nums, int k){
            int[] res = new int[k];
            Arrays.sort(nums);
            for (int i = 0; i < k; i++) {
                res[i] = nums[i];
            }
            return res;
        }
    }
