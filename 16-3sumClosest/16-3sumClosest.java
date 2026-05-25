// Last updated: 5/25/2026, 11:22:06 AM
class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int sum=0;
        int res=Integer.MAX_VALUE;
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            int l=i+1;
            int r=nums.length-1;
            while(l<r){
                sum=nums[i]+nums[l]+nums[r];
                if(sum==target)
                    return sum;
                if(Math.abs(res-target)>Math.abs(sum-target)){
                    res=sum;
                }
                if(sum>target)
                    r--;
                else 
                    l++;
            }
        }
        return res;
    }
}