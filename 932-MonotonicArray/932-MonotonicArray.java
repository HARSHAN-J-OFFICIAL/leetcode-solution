// Last updated: 5/25/2026, 11:16:17 AM
class Solution {
    public boolean isMonotonic(int[] nums) {
        int count=0;
        int c1=0;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]<=nums[i+1]){
                count++;
            }
            if(nums[i]>=nums[i+1]){
                c1++;
            }
        }
        if(count==nums.length-1||c1==nums.length-1){
            return true;
        }
        else{
            return false;
        }
    }
}