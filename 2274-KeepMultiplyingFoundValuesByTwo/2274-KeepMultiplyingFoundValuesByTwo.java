// Last updated: 5/25/2026, 11:14:15 AM
class Solution {
    public int findFinalValue(int[] nums, int original) {
        Arrays.sort(nums);
        for(int i:nums){
            if(original==i){
                original*=2;
            }
        }
        return original;
    }
}