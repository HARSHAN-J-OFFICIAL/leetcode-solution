// Last updated: 5/25/2026, 11:17:40 AM
class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int c=0;
        int max=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                c++;
                max=Math.max(c,max);
            }
            else{
                c=0;
            }
        }
        return max;
    }
}