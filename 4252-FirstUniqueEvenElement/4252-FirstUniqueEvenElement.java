// Last updated: 5/25/2026, 11:13:07 AM
class Solution {
    public int firstUniqueEven(int[] nums) {
 
        LinkedHashMap<Integer,Integer> hs=new LinkedHashMap<>();
        for(int i:nums){
            hs.put(i,hs.getOrDefault(i,0)+1);
        }
        for(int i:hs.keySet()){
            if(i%2==0 && hs.get(i)==1){
                return i;
            }
        }
        return -1;
    }
}