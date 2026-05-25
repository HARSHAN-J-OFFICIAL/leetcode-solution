// Last updated: 5/25/2026, 11:16:06 AM
class Solution {
    public int minAddToMakeValid(String s) {
        int open=0;
        int close=0;
       for(int i=0;i<s.length();i++){
        char c=s.charAt(i);
            if(c=='(')
                open++;
            else{
                if(open>0)
                    open--;
                else
                    close++;
            }
       }
       return close+open;
    }
}