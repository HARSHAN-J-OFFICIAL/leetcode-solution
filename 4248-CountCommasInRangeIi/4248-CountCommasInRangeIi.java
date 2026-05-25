// Last updated: 5/25/2026, 11:13:09 AM
class Solution {
    public long countCommas(long n) {
        long commas = 0;
        long t = 1000;

        while (t <= n) {
            commas += n - t + 1;
            t *= 1000;
        }

        return commas;
    }
}