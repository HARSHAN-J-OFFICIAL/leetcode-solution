// Last updated: 5/25/2026, 11:17:29 AM
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
    public List<Integer> largestValues(TreeNode root) {
        int max=Integer.MIN_VALUE;
        List<Integer> l=new ArrayList<>();
        if(root==null)
            return l; 
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            int n=q.size();
            for(int i=0;i<n;i++){
                TreeNode x=q.poll();
                if(x.val>max){
                    max=x.val;
                }
                if(x.left!=null)
                    q.add(x.left);
                if(x.right!=null)
                    q.add(x.right);
            }
            l.add(max);
            max=Integer.MIN_VALUE;
        }
        return l;
    }
}