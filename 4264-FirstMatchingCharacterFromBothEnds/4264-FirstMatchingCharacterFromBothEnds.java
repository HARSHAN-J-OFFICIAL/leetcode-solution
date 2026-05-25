// Last updated: 5/25/2026, 11:13:02 AM
class Solution {
    public int firstMatchingIndex(String s) {
        int n=s.length();
        for(int i=0;i<n && n-i-1>=0;i++){
            if(s.charAt(i)==s.charAt(n-i-1)){
                return i;
            }
        }
        return -1;
    }
}