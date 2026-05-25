// Last updated: 5/25/2026, 11:17:34 AM
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
    List<Integer> l = new ArrayList<>();

    public void inorder(TreeNode root) {
        if (root == null)
            return;
        inorder(root.left);
        l.add(root.val);
        inorder(root.right);
    }

    public int[] findMode(TreeNode root) {
        inorder(root);

        Map<Integer, Integer> hs = new HashMap<>();
        int maxFreq = 0;

        for (int val : l) {
            int freq = hs.getOrDefault(val, 0) + 1;
            hs.put(val, freq);
            maxFreq = Math.max(maxFreq, freq);
        }

        List<Integer> modes = new ArrayList<>();
        for (int key : hs.keySet()) {
            if (hs.get(key) == maxFreq) {
                modes.add(key);
            }
        }

        int[] arr = new int[modes.size()];
        for (int i = 0; i < modes.size(); i++) {
            arr[i] = modes.get(i);
        }

        return arr;
    }
}
