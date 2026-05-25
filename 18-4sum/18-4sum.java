// Last updated: 5/25/2026, 11:22:03 AM
class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> ar=new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length-3;i++){
            if(i>0 && nums[i]==nums[i-1]) continue;
            for(int j=i+1;j<nums.length-2;j++){
                if(j>i+1 && nums[j]==nums[j-1]) continue;
                int l=j+1;
                int h=nums.length-1;
                while(l<h){
                    long sum=(long)nums[i]+nums[j]+nums[l]+nums[h];
                    if(sum==target){
                        ar.add(Arrays.asList(nums[i],nums[j],nums[l],nums[h]));
                        l++;
                        h--;
                        while(l<h && nums[l]==nums[l-1]) l++;
                        while(l<h && nums[h]==nums[h+1]) h--;
                        
                    }
                    else if(sum>target){
                        h--;
                    }
                    else
                        l++;
                }
            }
            
        }
        return ar;
    }
}