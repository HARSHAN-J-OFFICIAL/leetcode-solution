// Last updated: 5/25/2026, 11:19:07 AM
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
    public ListNode reverseList(ListNode head) {
        ListNode a=null;
        ListNode b=head;
        ListNode c;
        while(b!=null){
            c=b.next;
            b.next=a;
            a=b;
            b=c;
            if(c!=null){
                c=c.next;
            }
        }
        return a;
    }
}