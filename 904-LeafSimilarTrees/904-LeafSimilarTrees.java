// Last updated: 5/25/2026, 11:16:22 AM
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
    List<Integer> l1=new ArrayList<>();
    List<Integer> l2=new ArrayList<>();
    public void tree1(TreeNode root){
        if(root==null)
            return;
        if(root.left==null && root.right==null){
            l1.add(root.val);
        }
        tree1(root.left);
        tree1(root.right);
    }

    public void tree2(TreeNode root){
        if(root==null)
            return;
        if(root.left==null && root.right==null){
            l2.add(root.val);
        }
        tree2(root.left);
        tree2(root.right);
    }
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        tree1(root1);
        tree2(root2);
        
         if(l1.size()!=l2.size())
                return false;

        for(int i=0;i<l1.size();i++){
            if(!l1.get(i).equals(l2.get(i)))
                return false;
        }
        return true;
    }
}