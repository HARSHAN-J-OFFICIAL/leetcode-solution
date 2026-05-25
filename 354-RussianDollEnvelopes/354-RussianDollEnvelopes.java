// Last updated: 5/25/2026, 11:18:07 AM
import java.util.*;

class Solution {
    public int maxEnvelopes(int[][] envelopes) {
        if (envelopes == null || envelopes.length == 0) return 0;
        Arrays.sort(envelopes, (a, b) -> {
            if (a[0] != b[0]) return a[0] - b[0];
            else return b[1] - a[1]; 
        });
        
        int[] heights = new int[envelopes.length];
        for (int i = 0; i < envelopes.length; i++) {
            heights[i] = envelopes[i][1];
        }
        
        return lengthOfLIS(heights);
    }
    
    private int lengthOfLIS(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int num : nums) {
            int idx = Collections.binarySearch(list, num);
            if (idx < 0) idx = -(idx + 1); 
            if (idx < list.size()) list.set(idx, num);
            else list.add(num);
        }
        return list.size();
    }
}