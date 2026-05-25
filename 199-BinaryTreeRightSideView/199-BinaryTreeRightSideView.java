// Last updated: 5/25/2026, 11:19:16 AM
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
    List<Integer> res;
    public List<Integer> rightSideView(TreeNode root) {
       res = new ArrayList<>();
       dfs(0,root);
       return res;
    }
    public void dfs(int d, TreeNode root){
        if(root == null) return;
        if(res.size() == d) res.add(root.val);
        dfs(d+1,root.right);
        dfs(d+1,root.left);
    }
}