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
    boolean condition=true;
    public int findDepth(TreeNode root){
        if(root==null) return 0;
        int left=findDepth(root.left);
        int right=findDepth(root.right);
        return 1+Math.max(left,right);
    }
    public void traverse(TreeNode root){
        if(root==null) return;
        if(condition==false) return;
        int depth=Math.abs(findDepth(root.left)-findDepth(root.right));
        if (depth>1){
            condition=false;
            return;
        }
        traverse(root.left);
        traverse(root.right);
    }
    public boolean isBalanced(TreeNode root) {
        traverse(root);
        return condition;
    }
}