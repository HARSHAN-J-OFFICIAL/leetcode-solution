// Last updated: 5/25/2026, 11:14:11 AM
class Solution {
    public int countAsterisks(String s) {
        int cnt=0;
        boolean temp=false;
        for(char c:s.toCharArray()){
            if(c=='|') temp=!temp;
            if(c=='*' && temp==false) cnt++;
        }
        return cnt;
    }
}