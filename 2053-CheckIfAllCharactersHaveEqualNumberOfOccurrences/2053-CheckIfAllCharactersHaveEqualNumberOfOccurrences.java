// Last updated: 5/25/2026, 11:14:27 AM
class Solution {
    public boolean areOccurrencesEqual(String s) {
        int[] freq = new int[26];

        for (char c : s.toCharArray()) {
            freq[c - 'a']++;
        }

        int expected = 0;
        for (int count : freq) {
            if (count == 0) continue;
            if (expected == 0) {
                expected = count;
            } else if (count != expected) {
                return false;
            }
        }

        return true;
    }
}