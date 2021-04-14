package _动态规划;
//选出最大和的数字组合,但是相邻的不能选
// 1 2 4 1 7 8 3
public class maxSum {
    public static void main(String[] args) {
        int[] nums = {1,2,4,1,7,8,3};
        int[] nums2 = {4,1,1,9,1};
        int res = maxSum(nums);
        int res2 = maxSum2(nums);
        System.out.println(res + " " + res2);
    }
    private static int maxSum(int[] nums) {
        int[] dp = new int[nums.length + 1];
        dp[0] = 0;
        dp[1] = nums[0];
        for (int i = 2; i <= nums.length; i++) {
            dp[i] = Math.max(dp[i-2] + nums[i-1], dp[i-1]);
        }
        return dp[nums.length];
    }
    private static int maxSum2(int[] nums) {
        int pre2 = 0;
        int pre1 = nums[0];
        for (int i = 1; i < nums.length; i++) {
            int cur = Math.max(pre2 + nums[i], pre1);
            pre2 = pre1;
            pre1 = cur;
        }
        return pre1;
    }
}
