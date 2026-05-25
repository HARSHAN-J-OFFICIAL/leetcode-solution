// Last updated: 5/25/2026, 11:16:15 AM
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
    public void inorder(TreeNode root){
        if(root==null)
            return;
        inorder(root.left);
        l.add(root.val);
        inorder(root.right);
    }
    public TreeNode increasingBST(TreeNode root) {
        inorder(root);
        TreeNode node=null;
        TreeNode newNode=new TreeNode(l.get(0));
        node=newNode;
        TreeNode curr=node;
        for(int i=1;i<l.size();i++){
            newNode=new TreeNode(l.get(i));
            curr.right=newNode;
            curr=curr.right;
        }
        return node;
    }
}