// Last updated: 5/25/2026, 11:15:46 AM
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public int[] nextLargerNodes(ListNode head) {
        Stack<Integer> st=new Stack<>();
        ArrayList<Integer> al= new ArrayList<>();
        ListNode temp=head;
        while(temp!=null){
            al.add(temp.val);
            temp=temp.next;
        }
        int res[]=new int[al.size()];
        for(int i=al.size()-1;i>=0;i--){
            int x=al.get(i);
            while(!st.empty() && x>=st.peek()){
                st.pop();
            }
            if(st.empty()){
                res[i]=0;
            }
            else{
                res[i]=st.peek();
            }
            st.push(x);
        }
        return res;

            
    }
}