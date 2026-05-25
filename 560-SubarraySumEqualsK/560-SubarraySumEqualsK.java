// Last updated: 5/25/2026, 11:17:17 AM
import java.util.*;

class Solution {
    public int subarraySum(int[] nums, int k) {
        int sum=0;
        int c=0;
        HashMap<Integer,Integer> hs=new HashMap<>();
        hs.put(0,1);
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            if(hs.containsKey(sum-k)){
                c=c+hs.get(sum-k);
            }
            hs.put(sum,hs.getOrDefault(sum,0)+1);
        }
        return c;
    }
}
