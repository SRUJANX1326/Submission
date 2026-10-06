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
    int prev=-1;
    int min=Integer.MAX_VALUE;
    public void traverse(TreeNode root){
        if(root==null) return;
        traverse(root.left);
        if(prev!=-1) min=Math.min(min,Math.abs(prev-root.val));
        prev=root.val;
        traverse(root.right);
    }
    public int minDiffInBST(TreeNode root) {
        traverse(root);
        return min;
    }
}