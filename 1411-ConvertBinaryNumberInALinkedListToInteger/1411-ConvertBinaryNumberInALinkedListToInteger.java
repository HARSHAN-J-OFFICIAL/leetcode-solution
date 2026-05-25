// Last updated: 5/25/2026, 11:15:21 AM
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
    public int getDecimalValue(ListNode head) {
        String s="";
        ListNode temp=head;
        int res=0;
        while(temp!=null){
            res=res*2+temp.val;    //no need to type temp.val%10 has all the values are 0 or 1
            temp=temp.next;
        }
        return res;
    }
}