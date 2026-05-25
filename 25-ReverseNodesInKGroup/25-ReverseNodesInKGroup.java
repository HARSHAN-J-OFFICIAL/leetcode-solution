// Last updated: 5/25/2026, 11:21:49 AM
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
    public ListNode reverseKGroup(ListNode head, int k) {
       ListNode temp=head;
        int co=0;
        while(temp!=null && co<k){
            temp=temp.next;
            co++;
        }
        if(co<k){
            return head;
        }
        ListNode a=null;
        ListNode b=head;
        ListNode c=b.next;
        co=0;
        while(co<k){
            b.next=a;
            a=b;
            b=c;
            if(c!=null){
                c=c.next;
            }
            co++;
        }
        head.next=reverseKGroup(b,k);
        return a;
    }
}