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
    int sum=0;
    int low=0;
    int high=0;
    public void traverse(TreeNode root){
        if(root==null) return;
        if(root.val>=low && root.val<=high) sum+=root.val;
        traverse(root.left);
        traverse(root.right);
    }
    public int rangeSumBST(TreeNode root, int l, int h) {
        low=l;
        high=h;
        traverse(root);
        return sum;
    }
}