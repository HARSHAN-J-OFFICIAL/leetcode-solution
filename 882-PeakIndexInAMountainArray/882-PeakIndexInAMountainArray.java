// Last updated: 5/25/2026, 11:16:24 AM
class Solution {
    public int peakIndexInMountainArray(int[] nums) {
        int low=0;
        int high=nums.length-1;
        while(low<high){
            int mid=(low+high)/2;
            if(nums[mid]<nums[mid+1]){
                low=mid+1;
            }
            else
                high=mid;
        }
        return low;
    }
}