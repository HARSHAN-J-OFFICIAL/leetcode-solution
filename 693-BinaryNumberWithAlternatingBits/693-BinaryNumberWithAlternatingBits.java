// Last updated: 5/25/2026, 11:16:55 AM
class Solution {
    public boolean hasAlternatingBits(int n) {
        int m=n^(n>>1);;
        return (m&(m+1))==0;
    }
}