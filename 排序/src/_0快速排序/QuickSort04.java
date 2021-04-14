package _0快速排序;

public class QuickSort04 {
    public static void main(String[] args) {
        int[] nums = {2,5,3,4,1,9,3,5};
        int left = 0;
        int right = nums.length - 1;
        quickSort(nums,left,right);
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
    }

    private static void quickSort(int[] nums, int left, int right) {
        if (left < right) {
            int mid = partition(nums,left,right);
            quickSort(nums,left,mid - 1);
            quickSort(nums,mid+1,right);
        }
    }

    private static int partition(int[] nums, int left, int right) {
        int pivot = nums[right];
        int i = left;
        for (int j = left; j < right; j++) {
            if (nums[j] <pivot) {
                swap(nums, i, j);
                i++;
            }
        }
        swap(nums,i,right);
        return i;
    }

    private static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

}
