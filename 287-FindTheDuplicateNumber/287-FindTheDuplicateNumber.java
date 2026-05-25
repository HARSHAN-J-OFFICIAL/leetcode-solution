// Last updated: 5/25/2026, 11:18:28 AM
class Solution {
    public int findDuplicate(int[] nums) {
        Set<Integer> hs=new HashSet<>();
        for(int i:nums){
            if(hs.contains(i)){
                return i;
            }
            hs.add(i);
        }
        return -1;
    }

}