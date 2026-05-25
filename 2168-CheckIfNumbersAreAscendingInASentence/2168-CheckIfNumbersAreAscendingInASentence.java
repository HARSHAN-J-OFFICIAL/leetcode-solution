// Last updated: 5/25/2026, 11:14:20 AM
class Solution {
    public boolean areNumbersAscending(String s) {
        int prev=-1,i=0,n=s.length();
        while(i<n){
            if(Character.isDigit(s.charAt(i))){
                int temp=0;
                while(i<n && Character.isDigit(s.charAt(i))){
                    int digit=s.charAt(i)-'0';
                    temp=temp*10+digit;
                    i++;
                }
                if(temp<=prev) return false;
                prev=temp;
            }
            i++;
        }
        return true;
    }
}