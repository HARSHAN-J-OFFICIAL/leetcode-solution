// Last updated: 5/25/2026, 11:13:28 AM
class Solution {
    public String clearDigits(String s) {
        Stack<Character> st=new Stack<>();
        StringBuilder sb=new StringBuilder();
        for(char i:s.toCharArray()){
            if(i>='a' && i<='z'){
                st.push(i);
            }
            else{
                st.pop();
            }
        }
        while(!st.empty()){
            sb.append(st.pop());
        }
        return sb.reverse().toString();
    }
}