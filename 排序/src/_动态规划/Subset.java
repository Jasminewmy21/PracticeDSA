package _动态规划;

//arr = {3, 34, 4, 12, 5, 2}; target = 9
//找到arr里加起来 == target的组合
public class Subset {
    public static void main(String[] args) {
        int[] arr = {3, 34, 4, 12, 5, 2};
        int target = 9;
        boolean res = dpSubSet(arr, target);
        boolean res2 = subSet2(arr, arr.length-1, target);
        System.out.println(res);
    }

    //subSet(
    private static boolean dpSubSet(int[] arr, int target) {
        int row = arr.length;
        int col = target;
        boolean[][] dp = new boolean[row+1][col+1];
        for (int i = 0; i <= row; i++) {
            dp[i][0] = true;
        }
        for (int j = 0; j <= col; j++) {
            if (arr[0] == j) {
                dp[0][j] = true;
            }
            dp[0][j] = false;
        }
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= col; j++) {
                if (arr[i] > j) {
                    dp[i][j] = dp[i-1][j];
                }
                dp[i][j] = dp[i-1][j] || dp[i-1][j-arr[i]];
            }
        }
        return dp[row][col];
    }
    private static boolean subSet2(int[] arr, int i, int target) {
        if (target == 0) return true;
        if (i == 0) return arr[i] == target;
        if (arr[i] > target)
            return subSet2(arr, i-1, target);
        else
            return subSet2(arr,i-1, target) || subSet2(arr,i-1, target - arr[i]);
    }
}
