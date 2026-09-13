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
    TreeSet<Integer> ans=new TreeSet();
    public void traverse(TreeNode root){
        if(root==null) return;
        ans.add(root.val);
        traverse(root.left);
        traverse(root.right);
    }
    public int findSecondMinimumValue(TreeNode root) {
        traverse(root);
        ans.removeFirst();
        try{
            return ans.getFirst();
        }catch(Exception E){
            return -1;
        }
    }
}