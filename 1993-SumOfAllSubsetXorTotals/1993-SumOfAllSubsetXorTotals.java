// Last updated: 5/25/2026, 11:14:32 AM
class Solution {
    public int subsetXORSum(int[] nums) {
        int total=0;
        for(int i:nums){
            total=total|i;
        }
        return total<<nums.length-1;
    }
}