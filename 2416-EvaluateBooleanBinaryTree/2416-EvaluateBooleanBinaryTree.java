// Last updated: 5/25/2026, 11:14:08 AM
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
    public boolean evaluateTree(TreeNode root) {
        if(root.val==2){
            return evaluateTree(root.left) || evaluateTree(root.right);
        }
        if(root.val==3){
            return evaluateTree(root.left) && evaluateTree(root.right);
        }

        return root.val==1;
    }
}