// Last updated: 5/25/2026, 11:15:40 AM
class Solution {
    public int countCharacters(String[] words, String chars) {
        int[] freq = new int[26];

        for (char c : chars.toCharArray()) {
            freq[c - 'a']++;
        }

        int sum = 0;

        for (String word : words) {
            int[] temp = freq.clone();   
            boolean ok = true;

            for (char c : word.toCharArray()) {
                if (temp[c - 'a'] == 0) {
                    ok = false;
                    break;
                }
                temp[c-'a']--;
            }

            if (ok) {
                sum += word.length();
            }
        }

        return sum;
    }
}
