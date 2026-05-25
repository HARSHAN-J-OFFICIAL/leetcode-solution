// Last updated: 5/25/2026, 11:16:07 AM
class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int curr1=0;
        int curr2=0;
        int maxsum=Integer.MIN_VALUE;
        int minsum=Integer.MAX_VALUE;
        int total=0;
        for(int i=0;i<nums.length;i++){
            total+=nums[i];

            curr1=Math.max(nums[i],nums[i]+curr1);
            curr2=Math.min(nums[i],nums[i]+curr2);

            maxsum=Math.max(maxsum,curr1);
            minsum=Math.min(minsum,curr2);

        }
        if(maxsum<0){
            return maxsum;
        }
        return Math.max(maxsum,total-minsum);
    }
}