// Last updated: 5/25/2026, 11:13:00 AM
class Solution {
    public int minAbsoluteDifference(int[] nums) {
        int min=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums.length;j++){
                if(i!=j){
                    if(nums[i]==1 && nums[j]==2){
                        min=Math.min(Math.abs(i-j),min);
                    }
                }
            }
        }
        return min!=Integer.MAX_VALUE?min:-1;
    }
}