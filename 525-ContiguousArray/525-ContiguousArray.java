// Last updated: 5/25/2026, 11:17:24 AM
class Solution {
    public int findMaxLength(int[] nums) {
        HashMap<Integer,Integer> hs=new HashMap<>();
        int sum=0,maxl=0,l=0;
        hs.put(0,-1);
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                sum-=1;
            }
            else{
                sum+=1;
            }
            if(hs.containsKey(sum)){
                l=i-hs.get(sum);
                maxl=Math.max(maxl,l);
            }
            else{
                hs.put(sum,i);
            }
        }
        return maxl;
    }
}