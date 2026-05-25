// Last updated: 5/25/2026, 11:18:12 AM
class Solution {
    public void reverseString(char[] s) {
        int i=0,j=s.length-1;
        while(i<j){
            char c=s[i];
            s[i]=s[j];
            s[j]=c;
            i++;
            j--;
        }
    }
}