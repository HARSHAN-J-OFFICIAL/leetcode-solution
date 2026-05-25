# Last updated: 5/25/2026, 11:20:47 AM
# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution(object):
    def deleteDuplicates(self, head):
        current = head
        while current and current.next:
            if current.val==current.next.val:
                current.next=current.next.next
            else:
                current=current.next
        return head
        """
        :type head: Optional[ListNode]
        :rtype: Optional[ListNode]
        """
        