// Last updated: 5/25/2026, 11:19:46 AM
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 **/
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
    public void reorderList(ListNode head) {
        Stack<ListNode> st = new Stack<>();
        ListNode temp = head;
        while(temp!=null)
        {
            st.push(temp);
            temp = temp.next;
        }
        temp = head;
        int n = st.size();
        for(int i=0;i<n/2;i++)
        {
            ListNode next = temp.next;
            ListNode last = st.pop();
            temp.next = last;
            last.next = next;

            temp = next;
        }
        temp.next=null;
    }
}