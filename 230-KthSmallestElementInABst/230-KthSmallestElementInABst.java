// Last updated: 5/25/2026, 11:18:53 AM
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
    List<Integer> l=new ArrayList<>();
    public void inOrder(TreeNode node){
        if(node==null)
            return;
        inOrder(node.left);
        l.add(node.val);
        inOrder(node.right);
    }
    public int kthSmallest(TreeNode root, int k) {
        inOrder(root);
        return l.get(k-1);
    }
}