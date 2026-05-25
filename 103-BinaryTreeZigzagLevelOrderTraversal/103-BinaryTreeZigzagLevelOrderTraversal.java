// Last updated: 5/25/2026, 11:20:20 AM
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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        Queue<TreeNode> q=new LinkedList<>();
        List<List<Integer>> arr=new ArrayList<>();
        if(root==null)
            return arr;
        boolean rev=false;
        q.add(root);
        while(!q.isEmpty()){
            int s=q.size();
            List<Integer> l=new ArrayList<>();
            for(int i=0;i<s;i++){
                TreeNode t=q.poll();
                l.add(t.val);
                if(t.left!=null)
                    q.add(t.left);
                if(t.right!=null)
                    q.add(t.right);
            }
            if(rev){
                Collections.reverse(l);
                arr.add(l);
            }
            else{
                arr.add(l);
            }
            rev=!rev;
        }
        return arr;
    }
}