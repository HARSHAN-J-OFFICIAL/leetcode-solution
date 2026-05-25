// Last updated: 5/25/2026, 11:17:38 AM
class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        return solve(nums, target, 0, 0);
    }

    int solve(int[] nums, int target, int sum, int i) {
        if (i == nums.length)
            return target == sum ? 1 : 0;

        return solve(nums, target, sum + nums[i], i + 1) + solve(nums, target, sum - nums[i], i + 1);
    }
}