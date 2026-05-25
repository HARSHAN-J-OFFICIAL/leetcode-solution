// Last updated: 5/25/2026, 11:15:15 AM
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
    public static TreeNode delete(TreeNode root,int x){
        if(root==null){
            return null;

        }
        root.left=delete(root.left,x);
        root.right=delete(root.right,x);
        if(root.left==null && root.right==null && root.val==x)
            return null;
        return root;
    }
    public TreeNode removeLeafNodes(TreeNode root, int target) {
        //Your code goes here
        return delete(root,target);
    }
}