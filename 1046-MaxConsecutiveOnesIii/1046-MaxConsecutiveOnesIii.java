// Last updated: 5/25/2026, 11:15:50 AM
class Solution {
    public int longestOnes(int[] nums, int k) {
        int max=0;
        int i=0;
        int c=0;
        for(int e=0;e<nums.length;e++){
            if(nums[e]==0){
                c++;
            }
            while(c>k){
                if(nums[i]==0)
                    c--;
                i++;
            }
            max=Math.max(max,e-i+1);
        }
        return max;
    }
}