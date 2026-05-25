// Last updated: 5/25/2026, 11:17:58 AM
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
    int sum=0;
    public void dfs(TreeNode root,boolean left){
        if(root==null){
            return;
        }
        if(root.left==null && root.right==null && left==true){
            sum+=root.val;
        }
        dfs(root.left,true);
        dfs(root.right,false);
    }
    public int sumOfLeftLeaves(TreeNode root) {
        dfs(root,false);
        return sum;
    }
}