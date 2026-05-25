// Last updated: 5/25/2026, 11:20:14 AM
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
    public TreeNode sortedArrayToBST(int[] nums) {
        return binary(nums,0,nums.length-1);
    }

    public TreeNode binary(int[] nums,int low,int high){
        if(low>high){
            return null;
        }
        int mid=low+(high-low)/2;

        TreeNode node=new TreeNode(nums[mid]);
        node.left=binary(nums,low,mid-1);
        node.right=binary(nums,mid+1,high);

        return node;
    }
}