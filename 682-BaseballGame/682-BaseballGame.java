// Last updated: 5/25/2026, 11:16:57 AM
class Solution {
    public int calPoints(String[] s) {
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<s.length;i++){
            if(s[i].equals("C")){
                st.pop();
            }
            else if(s[i].equals("D")){
                st.push(2*st.peek());
            }
            else if(s[i].equals("+")){
                int a=st.pop();
                int b=st.peek();
                st.push(a);
                st.push(a+b);
            }
            else{
                st.push(Integer.parseInt(s[i]));
            }
        }
        int sum=0;
        while(!st.empty()){
            sum+=st.pop();
        }
        return sum;
    }
}