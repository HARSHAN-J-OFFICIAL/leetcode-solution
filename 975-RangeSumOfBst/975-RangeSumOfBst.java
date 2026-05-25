// Last updated: 5/25/2026, 11:16:01 AM
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
    public int rangeSumBST(TreeNode root, int low, int high) {
        // 1. Base Case: If we hit a dead end, return 0
        if (root == null) {
            return 0;
        }

        // 2. Optimization: Too Small?
        if (root.val < low) {
            // Ignore left side, only search the right
            return rangeSumBST(root.right, low, high);
        }

        // 3. Optimization: Too Big?
        if (root.val > high) {
            // Ignore right side, only search the left
            return rangeSumBST(root.left, low, high);
        }

        // 4. Just Right: Count myself + both sides
        return root.val + rangeSumBST(root.left, low, high) + rangeSumBST(root.right, low, high);
    }
}