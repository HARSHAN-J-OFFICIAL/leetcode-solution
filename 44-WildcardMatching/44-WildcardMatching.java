// Last updated: 5/25/2026, 11:21:32 AM
class Solution {
    public boolean isMatch(String b, String a) {
        int i=0,j=0,start=-1,match=0;
        while(j<b.length()){
            if(i < a.length() && (a.charAt(i) == b.charAt(j) || a.charAt(i) == '?')){
                i++; j++;
            }
            else if(i < a.length()&&a.charAt(i)=='*'){
                start=i;
                match=j;
                i++;
            }
            else if(start!=-1){
                i=start+1;
                match++;
                j=match;
            }
            else return false;
            
        }
        while (i < a.length() && a.charAt(i) == '*') {
            i++;
        }      
        return i==a.length();
    }
}