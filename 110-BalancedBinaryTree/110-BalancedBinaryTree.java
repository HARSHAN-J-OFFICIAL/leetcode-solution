// Last updated: 5/25/2026, 11:20:12 AM
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
    public int check_height(TreeNode root){
        if(root==null){
            return 0;
        }
        int left=check_height(root.left);
        if(left==-1)
            return -1;
        int right=check_height(root.right);
        if(right==-1)
            return -1;
        if(Math.abs(left-right)>1){
            return -1;
        }
        return Math.max(left,right)+1;
    }
    public boolean isBalanced(TreeNode root) {
        return check_height(root)!=-1;
        
    }
}