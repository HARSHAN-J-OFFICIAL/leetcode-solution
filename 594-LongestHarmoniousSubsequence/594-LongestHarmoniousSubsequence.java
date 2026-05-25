// Last updated: 5/25/2026, 11:17:12 AM
class Solution {
    public int findLHS(int[] nums) {
        int s=0,e=1;
        int size=0;
        int max=0;
        Arrays.sort(nums);
        if(nums[s]==nums[nums.length-1]){
            return 0;
        }
        for(e=1;e<nums.length;e++){
            if(nums[e]-nums[s]==1){
                size=e-s+1;
            }
            while(nums[e]-nums[s]>1){
                s++;
            }
            max=Math.max(size,max);
        }
        return max;
    }
}