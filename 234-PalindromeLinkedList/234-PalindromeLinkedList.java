// Last updated: 5/25/2026, 11:18:50 AM
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

    public boolean isPalindrome(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode a=slow;
        ListNode b=slow.next;
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
        ListNode temp=head;
        while(temp!= slow){
            if(temp.val!=a.val){
                return false;
            }
            else{
                temp=temp.next;
                a=a.next;
            }
        }
        return true;
    }
}