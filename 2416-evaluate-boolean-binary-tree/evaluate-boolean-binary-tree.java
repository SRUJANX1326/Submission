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
    public int traverse(TreeNode root) {
        if (root == null)
            return 1;
        int val1 = traverse(root.left);
        int val2 = traverse(root.right);
        if (root.val == 2) {
            if (val1 == 1 || val2 == 1) {
                root.val = 1;
            } else {
                root.val = 0;
            }
        }
        if (root.val == 3) {
            if (val1 == 0 || val2 == 0) {
                root.val = 0;
            } else {
                root.val = 1;
            }
        }
        return root.val;
    }

    public boolean evaluateTree(TreeNode root) {
        if (root.left == null && root.right == null) {
            if (root.val == 1)
                return true;
            return false;
        }
        traverse(root);
        if (root.val == 0)
            return false;
        return true;
    }
}