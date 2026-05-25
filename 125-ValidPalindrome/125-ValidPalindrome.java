// Last updated: 5/25/2026, 11:19:59 AM
class Solution {
    public boolean isPalindrome(String s) {
        s=s.toLowerCase();
        StringBuilder sb=new StringBuilder();

        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if((c>='a' && c<='z') || (c>='0' && c<='9')){
                sb.append(c);
            }
        }
        int i=0;
        int j=sb.length()-1;
        while(i<=j){
            char c1=sb.charAt(i);
            char c2=sb.charAt(j);
            if(c1!=c2){
                return false;
            }
            i++;
            j--;
            
        }
        return true;
    }
}