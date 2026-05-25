// Last updated: 5/25/2026, 11:18:34 AM
class Solution {
    public int missingNumber(int[] nums) {
        int i=0;
        int n=nums.length;
       while(i<n){
            int in=nums[i];
            if(nums[i]!=nums.length && nums[i]!=nums[in]){
                int t=nums[i];
                nums[i]=nums[in];
                nums[in]=t;
            }
            else{
                i++;
            }

       }

       for(i=0;i<nums.length;i++){
            if(nums[i]!=i){
                return i;
            }
       }
       return nums.length;
    }
}