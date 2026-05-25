// Last updated: 5/25/2026, 11:19:47 AM
/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode check (ListNode head,ListNode slow){
        if(head==slow)
            return slow;
        while(head!=null && head.next!=null){
            head=head.next;
            slow=slow.next;
            if(head==slow)
                return slow;
        }
        return null;
    }
    public ListNode detectCycle(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                return check(head,slow);
            }
        }
        return null;
    }
}