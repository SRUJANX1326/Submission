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
    String string;
    public void traverse(TreeNode root){
        if(root==null) return;
        if(root.left==null && root.right==null){
            string=string+Integer.toString(root.val)+" ";
        }
        traverse(root.left);
        traverse(root.right);
    }
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        string="";
        traverse(root1);
        String one=string;
        string="";
        traverse(root2);
        String two=string;
        System.out.println(one);
        System.out.println(two);
        return one.equals(two);
    }
}