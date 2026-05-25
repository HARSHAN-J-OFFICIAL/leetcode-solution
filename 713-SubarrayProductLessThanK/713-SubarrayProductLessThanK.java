// Last updated: 5/25/2026, 11:16:52 AM
class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        if(k<=1)
            return 0;
       int c=0;
       int pro=1;
       int i=0;
       for(int e=0;e<nums.length;e++){
            pro*=nums[e];
            while(pro>=k){
                pro/=nums[i];
                 i++;
            }
            c+=e-i+1;
       }
       return c;
    }
}