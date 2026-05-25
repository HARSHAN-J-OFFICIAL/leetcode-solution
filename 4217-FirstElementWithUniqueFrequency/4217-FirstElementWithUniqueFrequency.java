// Last updated: 5/25/2026, 11:13:14 AM
class Solution {
    public int firstUniqueFreq(int[] nums) {
        Map<Integer,Integer> map=new HashMap<>();
        for(int i:nums)
            {
                map.put(i,map.getOrDefault(i,0)+1);
            }
        Map<Integer,Integer> m=new HashMap<>();
        for(int f:map.values())
            {
                m.put(f,m.getOrDefault(f,0)+1);
            }
        for(int i:nums)
            {
                int f=map.get(i);
                if(m.get(f)==1)
                    return i;
            }
        return -1;
    }
}