// Last updated: 5/25/2026, 11:16:39 AM
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
    public TreeNode insertIntoBST(TreeNode root, int val) {
        if(root==null){
            TreeNode node=new TreeNode(val);
            return node;
        }
        if(root.val<val){
            TreeNode left=insertIntoBST(root.right,val);
            root.right=left;
        }
        else{
            TreeNode right=insertIntoBST(root.left,val);
            root.left=right;
        }
        return root;
    }

}