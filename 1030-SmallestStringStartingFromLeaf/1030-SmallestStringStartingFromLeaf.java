// Last updated: 5/25/2026, 11:15:53 AM
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
    String res=null;
    public String smallestFromLeaf(TreeNode root) {
        StringBuilder sb=new StringBuilder();
        dfs(root,sb);
        return res;
    }

    public void dfs(TreeNode root,StringBuilder sb){
        if(root==null){
            return;
        }
        sb.append((char) ('a'+root.val));
        if(root.left==null && root.right==null){
            sb.reverse();
            String path=sb.toString();
            sb.reverse();
            if(res==null || path.compareTo(res)<0)
                res=path;
        }
        dfs(root.left,sb);
        dfs(root.right,sb);
        sb.deleteCharAt(sb.length()-1);

    }
}