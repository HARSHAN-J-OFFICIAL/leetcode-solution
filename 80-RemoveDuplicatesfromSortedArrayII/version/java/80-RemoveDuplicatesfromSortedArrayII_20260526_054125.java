// Last updated: 5/26/2026, 5:41:25 AM
1class Solution {
2    public int removeDuplicates(int[] nums) {
3        int k = 0;
4        for (int j = 0; j < nums.length; j++) {
5            if (k < 2 || nums[j] != nums[k - 2]) {
6                nums[k] = nums[j];
7                k++;
8            }
9        }
10        return k;
11    }
12}