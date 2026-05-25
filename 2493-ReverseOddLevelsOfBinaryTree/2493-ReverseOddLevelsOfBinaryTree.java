// Last updated: 5/25/2026, 11:14:00 AM
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
    public TreeNode reverseOddLevels(TreeNode root) {
        boolean odd=false;
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            int n=q.size();
            List<TreeNode> l=new ArrayList<>();
            for(int i=0;i<n;i++){
                TreeNode t=q.poll();
                l.add(t);
                if(t.left!=null)
                    q.add(t.left);
                if(t.right!=null)
                    q.add(t.right);
            }
            if(odd){
                int i=0;
                int j=l.size()-1;
                while(i<j){
                    int t=l.get(i).val;
                    l.get(i).val=l.get(j).val;
                    l.get(j).val=t;
                    i++;
                    j--;
                }
            }
            odd=!odd;
        }
        return root;
    }
}