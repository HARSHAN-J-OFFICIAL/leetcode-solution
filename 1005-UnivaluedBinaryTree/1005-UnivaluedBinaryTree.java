// Last updated: 5/25/2026, 11:15:58 AM
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
    public boolean check(TreeNode root,int value){
        if(root==null){
            return true;
        }
        if(root.val!=value){
            return false;
        }
        return check(root.left,root.val) && check(root.right,root.val);
    }
    public boolean isUnivalTree(TreeNode root) {
       return check(root,root.val);

        
    }
}