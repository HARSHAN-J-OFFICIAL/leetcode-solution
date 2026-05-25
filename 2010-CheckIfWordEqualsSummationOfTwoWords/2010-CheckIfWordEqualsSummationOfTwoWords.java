// Last updated: 5/25/2026, 11:14:31 AM
class Solution {
    public boolean isSumEqual(String firstWord, String secondWord, String targetWord) {
        return toNumber(firstWord) + toNumber(secondWord) == toNumber(targetWord);
    }

    private long toNumber(String word) {
        long num = 0;
        for (char c : word.toCharArray()) {
            num = num * 10 + (c - 'a');
        }
        return num;
    }
}