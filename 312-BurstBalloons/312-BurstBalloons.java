// Last updated: 5/25/2026, 11:18:21 AM
class Solution {
    public int maxCoins(int[] nums) {
        int n = nums.length;
        
        int[] val = new int[n + 2];
        val[0] = 1;
        val[n + 1] = 1;
        for (int i = 0; i < n; i++) {
            val[i + 1] = nums[i];
        }

        int[][] dp = new int[n + 2][n + 2];

        for (int length = 2; length <= n + 1; length++) {
            for (int left = 0; left + length <= n + 1; left++) {
                int right = left + length;

                for (int k = left + 1; k < right; k++) {
                    dp[left][right] = Math.max(
                        dp[left][right],
                        dp[left][k] + dp[k][right] + val[left] * val[k] * val[right]
                    );
                }
            }
        }

        return dp[0][n + 1];
    }
}