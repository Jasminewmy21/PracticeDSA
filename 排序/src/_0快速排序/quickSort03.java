package _0快速排序;

public class quickSort03 {
    public static void main(String[] args) {
        int[] nums = {3,2,1,5,6,4};
        int k = 2;
        quickSort(nums,0,nums.length - 1);
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();
    }

    private static void quickSort(int[] nums, int low, int high) {
        if (low >= high) return;
        int index = partition(nums,low,high);
        quickSort(nums,low,index-1);
        quickSort(nums,index+1,high);
    }


    private static int findKthLargest(int[] nums, int k) {
        k = nums.length - k;
        int l = 0, h = nums.length - 1;
        while (l < h) {
            int j = partition(nums, l, h);
            if (j == k) {
                break;
            } else if (j < k) {
                l = j + 1;
            } else {
                h = j - 1;
            }
        }
        return nums[k];
    }

    private static int partition(int[] nums, int left, int right) {
        int i = left;
        int j = right + 1;
        while (true) {
            while (nums[++i] < nums[left] && i < right) ;
            while (nums[--j] > nums[left] && j > left) ;
            if ( i >= j) {
                break;
            }
            swap(nums, i, j);
        }
        swap(nums, left, j);
        return j;
    }

    private static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
