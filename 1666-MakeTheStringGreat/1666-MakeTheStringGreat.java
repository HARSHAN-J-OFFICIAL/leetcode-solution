// Last updated: 5/25/2026, 11:14:54 AM
class Solution {
    public String makeGood(String s) {
        Stack<Character> st=new Stack<>();
        StringBuilder sb=new StringBuilder();
        st.push(s.charAt(0));
        for(int i=1;i<s.length();i++){
            char c=s.charAt(i);
            // if(st.empty()){
            //     st.push(c);
            //     continue;
            // }

            if((!st.empty()) && (st.peek()==c-32 || st.peek()==c+32)){
                st.pop();
                continue;
            }
            st.push(c);
        }
        while(!st.isEmpty()){
            sb.append(st.pop());
        }
        return sb.reverse().toString();
    }
}