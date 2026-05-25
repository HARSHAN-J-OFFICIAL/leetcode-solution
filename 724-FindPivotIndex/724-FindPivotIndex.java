// Last updated: 5/25/2026, 11:16:51 AM
class Solution {
    public int pivotIndex(int[] nums) {
        int total=0;
        for(int i=0;i<nums.length;i++){
            total+=nums[i];
        }
        int left=0;
        for(int i=0;i<nums.length;i++){
            int right=total-left-nums[i];
            if(right==left){
                return i;
            }
            else{
                left+=nums[i];
            }
        }
        return -1;
    }
}