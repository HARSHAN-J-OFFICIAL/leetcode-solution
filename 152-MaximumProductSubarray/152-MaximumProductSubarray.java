// Last updated: 5/25/2026, 11:19:38 AM
class Solution {
    public int maxProduct(int[] nums) {
        int curr=nums[0];
        int max=nums[0];
        int min=nums[0];
        for(int i=1;i<nums.length;i++){
            int tmax=Math.max(nums[i],Math.max(max*nums[i],min*nums[i]));

            int tmin=Math.min(nums[i],Math.min(max*nums[i],min*nums[i]));
            
            max=tmax;
            min=tmin;
            curr=Math.max(curr,max);
        }
        return curr;
    }
}