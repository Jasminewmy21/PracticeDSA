package _0快速排序;

public class QuickSort02 {
    public static void main(String[] args) {
        int[] nums = {3,2,3,1,2,4,5,5,6};
        quickSort(nums, 0, nums.length - 1);
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
    }

    private static void quickSort(int[] nums, int left, int right) {
        if (left < right) {
            int mid = getMid(nums, left, right);
            quickSort(nums, left, mid - 1);
            quickSort(nums, mid + 1, right);
        }
    }

    private static int getMid(int[] nums, int left, int right) {
        int pivot = nums[left];
        while (left < right) {
            while (nums[right] >= pivot && left < right) {
                right--;
            }
            nums[left] = nums[right];
            while (nums[left] <= pivot && left < right) {
                left++;
            }
            nums[right] = nums[left];
        }
        nums[left] = pivot;
        return left;
    }
}
