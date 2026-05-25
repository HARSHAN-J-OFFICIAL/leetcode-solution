// Last updated: 5/25/2026, 11:13:13 AM
class Solution {
    public String trimTrailingVowels(String s) {
        Stack<Character> st=new Stack<>();
        for(int i=0;i<s.length();i++){
            st.push(s.charAt(i));
        }
        String str="aeiou";
        while(!st.isEmpty()){
            if(str.indexOf(st.peek())!=-1){
                st.pop();
            }
            else{
                break;
            }
        }
        StringBuilder res=new StringBuilder();
        while(!st.isEmpty()){
            res.append(st.pop());
        }
        return res.reverse().toString();
    }
}