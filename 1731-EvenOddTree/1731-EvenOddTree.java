// Last updated: 5/25/2026, 11:14:51 AM
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
    public boolean isEvenOddTree(TreeNode root) {
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        boolean even=true;
        while(!q.isEmpty()){
            int prev=(even)?Integer.MIN_VALUE:Integer.MAX_VALUE;
            int s=q.size();
            for(int i=0;i<s;i++){
                TreeNode t=q.poll();
                if(even){
                    if(prev>=t.val || t.val%2==0)
                        return false;
                }
                else{
                    if(prev<=t.val || t.val%2!=0)
                        return false;
                }
                prev=t.val;
                if(t.left!=null)
                    q.add(t.left);
                if(t.right!=null)
                    q.add(t.right);
            }
            even=!even;
        }
        return true;
    }
}