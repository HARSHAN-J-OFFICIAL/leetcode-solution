// Last updated: 5/25/2026, 11:20:11 AM
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int minDepth(TreeNode root) {
        if(root==null)
            return 0;
        int a=minDepth(root.left);
        int b=minDepth(root.right);
        if(a==0)
            return b+1;
        if(b==0)
            return a+1;
        return Math.min(a,b)+1;
    }
}