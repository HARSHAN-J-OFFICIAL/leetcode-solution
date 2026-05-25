// Last updated: 5/25/2026, 11:17:05 AM
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
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> arr=new ArrayList<>();
       if(root==null)
            return arr;
       Queue<TreeNode> q=new LinkedList<>();
       q.add(root);
       while(!q.isEmpty()){
            int size=q.size();
            double avg=0;
            for(int i=0;i<size;i++){
                root=q.poll();
                avg+=root.val;
                if(root.left!=null)
                    q.add(root.left);
                if(root.right!=null)
                    q.add(root.right);
            }
            arr.add(avg/size);
       }
       return arr;

        
    }
}