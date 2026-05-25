// Last updated: 5/25/2026, 11:22:01 AM
class Solution {
    public boolean isValid(String s) {
        Stack<Character> st=new Stack<>();
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(c=='('||c=='{' || c=='['){
                st.push(c);
            }
            else {
                if(st.isEmpty()){
                    return false;
                }
                if(!((st.peek()=='{'&& c=='}') || (st.peek()=='[' && c==']')|| (st.peek()=='(' && c==')'))){
                    return false;
                }
                else{
                    st.pop();
                }
            }
        }
        return st.isEmpty();
    }
}