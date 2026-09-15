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
    TreeNode parent_one;
    TreeNode parent_two;
    TreeNode parent;
    int depth_one;
    int depth_two;
    public int findDepth(TreeNode root, int target, int depth) {
        if (root == null)
            return -1;
        if (root.val == target)
            return depth;
        int left = findDepth(root.left, target, depth + 1);
        if(left!=-1) return left ;
        return findDepth(root.right, target, depth+1);
    }

    public void traverse(TreeNode root, int target) {
        if (root == null)
            return;
            
        traverse(root.left, target);
        traverse(root.right, target);
        if (root.left != null) {
            if (root.left.val == target){
                parent = root;
                return;
            }
        }
        if (root.right != null) {
            if (root.right.val == target){
                parent = root;
                return;
            }
        }
        
    }

    public boolean isCousins(TreeNode root, int x, int y) {
        traverse(root, x);
        parent_one = parent;
        depth_one = findDepth(root, x, 0);
        traverse(root, y);
        parent_two = parent;
        depth_two = findDepth(root, y, 0);
        
        if (parent_one == parent_two || depth_one != depth_two)
            return false;
        if (parent_one != parent_two && depth_one == depth_two)
            return true;
        return false;
    }
}