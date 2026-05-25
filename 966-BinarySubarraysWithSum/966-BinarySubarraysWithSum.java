// Last updated: 5/25/2026, 11:16:02 AM
class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        int sum = 0;
        int count = 0;
        Map<Integer, Integer> hs = new HashMap<>();
        hs.put(0, 1);
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];

            if (hs.containsKey(sum - goal)) {
                count += hs.get(sum - goal);
            }
            hs.put(sum, hs.getOrDefault(sum, 0) + 1);
        }
        return count;
    }
}