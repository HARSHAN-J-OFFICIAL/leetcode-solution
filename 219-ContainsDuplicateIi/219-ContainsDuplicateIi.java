// Last updated: 5/25/2026, 11:19:00 AM
class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer,Integer> hs=new HashMap<>();
        
        for(int i=0;i<nums.length;i++){
            if(hs.containsKey(nums[i]) && i-hs.get(nums[i])<=k){
                return true;
            }
            else{
                hs.put(nums[i],i);
            }
        }
        return false;
    }
}