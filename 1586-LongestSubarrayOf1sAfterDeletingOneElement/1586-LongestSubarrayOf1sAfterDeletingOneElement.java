// Last updated: 5/25/2026, 11:15:00 AM
class Solution {
    public int longestSubarray(int[] nums) {
        int curr=0;
        int prev=0;
        int max=0;
        for(int i:nums){
            if(i==1){
                curr++;
            }
            else{
                prev=curr;
                curr=0;
            }
            if(max<prev+curr)
                max=prev+curr;
        }

        return curr==nums.length?nums.length-1:max;
    }
}