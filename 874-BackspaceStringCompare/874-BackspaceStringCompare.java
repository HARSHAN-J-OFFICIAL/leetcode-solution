// Last updated: 5/25/2026, 11:16:25 AM
class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> st1=new Stack<>();
        Stack<Character> st2=new Stack<>();
        for(char i:s.toCharArray()){
            // char c=s.charAt(i);
            if(st1.isEmpty() && i=='#'){
                continue;
            }
            else if(!st1.isEmpty() && i=='#'){
                st1.pop();
            }
            else{
                st1.push(i);
            }
        }
        for(char i:t.toCharArray()){
            // char c=t.charAt(i);
            if(st2.isEmpty() && i=='#'){
                continue;
            }
            
            else if(!st2.isEmpty() && i=='#'){
                st2.pop();
            }
            else{
                st2.push(i);
            }
        }
        return st1.equals(st2);
    }
}