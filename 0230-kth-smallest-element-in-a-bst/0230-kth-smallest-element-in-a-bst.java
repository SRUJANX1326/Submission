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
    ArrayList<Integer> AL=new ArrayList();
    public void traverse(TreeNode root){
        if(root==null) return;
        traverse(root.left);
        AL.add(root.val);
        traverse(root.right);
    }
    public int kthSmallest(TreeNode root, int k) {
        traverse(root);
        return AL.get(k-1);
    }
}