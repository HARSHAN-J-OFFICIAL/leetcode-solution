// Last updated: 5/25/2026, 11:15:44 AM
class Solution {
    public String removeOuterParentheses(String s) {
        Stack<Character> st = new Stack<>();
        StringBuilder sb = new StringBuilder();
        int count = 0;
        for(int i = 0;i<s.length();i++){
            if(s.charAt(i) == '('){
                if(!st.isEmpty()){
                    sb.append(s.charAt(i));
                }
                st.push(s.charAt(i));
            }else{
                if(st.size() != 1){
                    sb.append(s.charAt(i));
                }
                st.pop();
            }
        }
        return sb.toString();
    }
}