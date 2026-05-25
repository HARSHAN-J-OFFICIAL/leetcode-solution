// Last updated: 5/25/2026, 11:13:11 AM
class Solution {
    public int countCommas(int n) {
        int commas = 0;

        if (n >= 1000) commas += n - 999;
        if (n >= 1_000_000) commas += n - 999_999;
        if (n >= 1_000_000_000) commas += n - 999_999_999;

        return commas;
    }
}