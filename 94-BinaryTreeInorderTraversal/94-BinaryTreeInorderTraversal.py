# Last updated: 5/25/2026, 11:20:36 AM
# Definition for a binary tree node.
# class TreeNode(object):
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution(object):
    def inorderTraversal(self, root):
        stack=[]
        result=[]
        current=root
        while current or stack:
            while current:
                stack.append(current)
                current=current.left
            current=stack.pop()
            result.append(current.val)
            current=current.right
        return result
        """
        :type root: Optional[TreeNode]
        :rtype: List[int]
        """
        