// Last updated: 5/25/2026, 11:18:30 AM
class Solution {
    public void moveZeroes(int[] nums) {
        int i=0;
        for(int j=1;j<nums.length;j++){
            if(nums[i]==0 && nums[j]!=0){
                int t=nums[i];
                nums[i]=nums[j];
                nums[j]=t;
                i++;
            }
            else if(nums[i]!=0){
                i++;
                
            }
            else{
                continue;
            }
        }
    }
}