// Last updated: 5/25/2026, 11:20:17 AM
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
    int pi = 0;
    TreeNode root = null;
    HashMap<Integer,Integer> m = new HashMap<>();
    public TreeNode dfs(int[] preorder,int start,int end){
        if(start <= end){
            int ele = preorder[pi++];
            int mid = m.get(ele);
            TreeNode root = new TreeNode(ele);
            root.left = dfs(preorder,start,mid-1);
            root.right = dfs(preorder,mid+1,end);
            return root;
        }
        return null;
    }
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        for(int i = 0;i<inorder.length;i++){
            m.put(inorder[i],i);
        }
        return dfs(preorder,0,preorder.length-1);
    }
}