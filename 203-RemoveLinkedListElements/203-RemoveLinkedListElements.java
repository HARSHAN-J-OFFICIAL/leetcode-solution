// Last updated: 5/25/2026, 11:19:12 AM
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
    public ListNode removeElements(ListNode head, int val) {
        if(head==null){
            return head;
        }
        while(head.val==val){
            head=head.next;
            if(head==null){
                return head;
            }
        }
        ListNode temp=head;
        while(temp.next!=null){
            if(temp.next.val==val){
                temp.next=temp.next.next;
            }
            else{
                temp=temp.next;
            }
        }
        return head;




        // ListNode dummy=new ListNode(0);
        // // while(head.val==val){
        // //     head=head.next;
        // //     if(head==null){
        // //         return head;
        // //     }
        // // }
        // dummy.next=head;
        // ListNode t=dummy;
        // while(t.next!=null){
        //     if(t.next.val==val){
        //         t.next=t.next.next;
        //     }
        //     else{
        //         t=t.next;
        //     }
        // }
        // return dummy.next;
    }
}