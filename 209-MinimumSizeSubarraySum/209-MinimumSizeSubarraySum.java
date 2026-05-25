// Last updated: 5/25/2026, 11:19:03 AM
class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int sum1=0;
        for(int i:nums){
            sum1+=i;
        }
        if(sum1<target)
            return 0;
        int min=Integer.MAX_VALUE;
        int sum=0;
        int i=0;
        for(int e=0;e<nums.length;e++){
            sum+=nums[e];
            while(sum>=target){
                 min=Math.min(min,e-i+1);
                sum-=nums[i++];
            }
        }
        return min;
    }
}