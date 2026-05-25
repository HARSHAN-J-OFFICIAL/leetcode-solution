// Last updated: 5/25/2026, 11:19:34 AM
class Solution {
    public int findPeakElement(int[] nums) {
        int t=0;
        int low=0;
        int high=nums.length-1;
        while(low<high){
            int mid=low+(high-low)/2;
            if(nums[mid]<nums[mid+1]){
                low=mid+1;

            }
            else{
                high=mid;
            }

        }
        return low;
    }
}