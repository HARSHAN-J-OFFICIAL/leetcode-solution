// Last updated: 5/25/2026, 11:20:49 AM
class Solution {
    public String minWindow(String s, String t) {
        if (s.length() == 0 || t.length() == 0) 
            return "";

        int[] need = new int[128];
        for (char c : t.toCharArray()) 
            need[c]++;

        int missing = t.length();
        int left = 0;

        int minLen = Integer.MAX_VALUE;
        int start = 0;

        for (int right = 0; right < s.length(); right++) {
            char c = s.charAt(right);

            if (need[c] > 0)
                missing--;
            need[c]--;

            while (missing == 0) {
                if (right - left + 1 < minLen) {
                    minLen = right - left + 1;
                    start = left;
                }

                char lc = s.charAt(left);
                need[lc]++;
                if (need[lc] > 0)
                    missing++;
                left++;
            }
        }

        return minLen == Integer.MAX_VALUE ? "" : s.substring(start, start + minLen);
    }
}