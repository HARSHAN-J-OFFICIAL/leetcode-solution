// Last updated: 5/25/2026, 11:13:40 AM
class Solution {
    public int minLength(String s) {
        Stack<Character> st=new Stack<>();
        for(int i=0;i<s.length();i++){
            if(!st.isEmpty() && ((s.charAt(i)=='B'&& st.peek()=='A') || (s.charAt(i)=='D' && st.peek()=='C'))){
                st.pop();
            }
            else{
                st.push(s.charAt(i));
            }
        }
        // sb=sb.reverse();
        return st.size();
    }
}