// Last updated: 5/25/2026, 11:20:50 AM
class Solution {
    public void sortColors(int[] nums) {
        int low=0;
        int high=nums.length-1;
        int mid=0;
        while(mid<=high){
            if(nums[mid]==0){
                int t=nums[mid];
                nums[mid]=nums[low];
                nums[low]=t;
                low++;
                mid++;
            }
            else if(nums[mid]==2){
                int t=nums[high];
                nums[high]=nums[mid];
                nums[mid]=t;
                high--;
            }
            else
                mid++;
        }
    }
}