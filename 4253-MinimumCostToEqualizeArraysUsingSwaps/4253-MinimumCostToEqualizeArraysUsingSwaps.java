// Last updated: 5/25/2026, 11:13:05 AM
class Solution {
    public int minCost(int[] nums1, int[] nums2) {
        int n=80000;
        HashMap<Integer,Integer> hs=new HashMap<>();
        for(int i:nums1){
            hs.put(i,hs.getOrDefault(i,0)+1);
        }
        for(int i:nums2){
            hs.put(i,hs.getOrDefault(i,0)-1);
        }
        int sum=0;
        for(int i:hs.keySet()){
            if(Math.abs(hs.get(i))%2!=0){
                return -1;
            }
            sum+=Math.abs(hs.get(i));
            
        }
        return sum/4;
    }
}