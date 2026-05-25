// Last updated: 5/25/2026, 11:15:59 AM
class Solution {
    public int repeatedNTimes(int[] nums) {
        Set<Integer> hs=new HashSet<>();
        for(int i:nums){
            if(!hs.contains(i))
                hs.add(i);
            else
                return i;
        }
        return -1;
           
    }
}