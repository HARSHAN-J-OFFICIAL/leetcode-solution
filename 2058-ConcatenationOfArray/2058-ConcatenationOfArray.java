// Last updated: 5/25/2026, 11:14:29 AM
class Solution {
    public int[] getConcatenation(int[] nums) {
        int size=nums.length;
        int ans[]=new int[2*size];
        for(int i=0;i<size;i++){
            ans[i]=nums[i];
            ans[i+size]=nums[i];
        }
        return ans;
    }
}