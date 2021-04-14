package _0快速排序;

import java.util.Arrays;

public class QuickSort01 {
    public static void main(String[] args) {
        int[] nums = {2,3,6,4,1,7,5,9};
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i]+" ");
        }
    }
}
