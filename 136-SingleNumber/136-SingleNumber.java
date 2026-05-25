// Last updated: 5/25/2026, 11:19:50 AM
class Solution {
    public int singleNumber(int[] nums) {
        int a=0;
        for(int i=0;i<nums.length;i++){
            a=a^nums[i];
        }
        return a;
        // HashMap<Integer,Integer> hs=new HashMap<>();
        // for(int i:nums){
        //     hs.put(i,hs.getOrDefault(i,0)+1);
        // }
        
    }
}