// Last updated: 5/25/2026, 11:19:01 AM
class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> hs=new HashSet<>();
        for(int i:nums){
            if(hs.contains(i)){
                return true;
            }
            hs.add(i);
        }
        return false;
    }
}