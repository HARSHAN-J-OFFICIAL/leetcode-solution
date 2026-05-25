// Last updated: 5/25/2026, 11:21:17 AM
class Solution {
    public boolean canJump(int[] nums) {
        int cnt=0;
        for(int i=0;i<nums.length;i++){
            if(i>cnt) return false;
            cnt=Math.max(cnt,i+nums[i]);
            if(cnt>=nums.length-1) return true;
        }
        return true;
    }
}
    