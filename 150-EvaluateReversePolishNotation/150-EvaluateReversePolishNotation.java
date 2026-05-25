// Last updated: 5/25/2026, 11:19:41 AM
class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> st=new Stack<>();
        String str="+-*/";
        for(int i=0;i<tokens.length;i++){
            if(str.indexOf(tokens[i])==-1){
                int t=Integer.parseInt(tokens[i]);
                st.push(t);
            }
            else{
                int num1=st.pop();
                int num2=st.pop();
                if(tokens[i].equals("+")){
                    int res=num1+num2;
                    st.push(res);
                }
                else if(tokens[i].equals("-")){
                    int res=num2-num1;
                    st.push(res);
                }
                else if(tokens[i].equals("*")){
                    int res=num1*num2;
                    st.push(res);
                }
                else if(tokens[i].equals("/")){
                    int res=num2/num1;
                    st.push(res);
                }
            }
        }
        return st.pop();
    }
}