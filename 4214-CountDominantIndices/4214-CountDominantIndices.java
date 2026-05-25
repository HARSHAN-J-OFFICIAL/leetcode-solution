// Last updated: 5/25/2026, 11:13:16 AM
class Solution {
    public int dominantIndices(int[] nums) {
        int n = nums.length;
        if (n <= 1) return 0;

        long suffixSum = 0;
        int count = 0;
        int dominantCount = 0;

        for (int i = n - 1; i >= 0; i--) {
            if (count > 0) {
                if ((long) nums[i] * count > suffixSum) {
                    dominantCount++;
                }
            }
            suffixSum += nums[i];
            count++;
        }

        return dominantCount;
    }
}
