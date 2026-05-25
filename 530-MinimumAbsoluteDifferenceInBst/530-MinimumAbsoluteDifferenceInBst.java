// Last updated: 5/25/2026, 11:17:23 AM
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
    public void inOrder(TreeNode root){
        if(root==null)
            return;
        inOrder(root.left);
        l.add(root.val);
        inOrder(root.right);
    }
    public int getMinimumDifference(TreeNode root) {
        inOrder(root);
        int min=Integer.MAX_VALUE;
        for(int i=0;i<l.size()-1;i++){
            int sum=Math.abs(l.get(i)-l.get(i+1));
            if(sum<min){
                min=sum;
            }
        }
        return min;
    }
}