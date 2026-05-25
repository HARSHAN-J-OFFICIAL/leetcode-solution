// Last updated: 5/25/2026, 11:17:59 AM
class Solution {
    public boolean isSubsequence(String s, String t) {
        if(s.length()==0)
            return true;
        int i=0;
        int j=0;
        int c=0;
        while(j<t.length() && i<s.length()){
            if(s.charAt(i)==t.charAt(j)){
                c++;
                i++;
            }
            j++;

        }
        return c==s.length()?true:false;
    }
}