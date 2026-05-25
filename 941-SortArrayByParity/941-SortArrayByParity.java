// Last updated: 5/25/2026, 11:16:11 AM
class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int ans[]=new int[nums.length];
        int low=0;
        int high=nums.length-1;
        while(low<=high){
            if(nums[low]%2!=0){
                int t=nums[low];
                nums[low]=nums[high];
                nums[high]=t;
                high--;
            }
            else{
                low++;
            }
        }
        for(int i=0;i<nums.length;i++){
            ans[i]=nums[i];
        }
        return ans;
    }
}