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
    TreeNode answerNode=new TreeNode();
    boolean found=false;
    public void traverse(TreeNode root,int val){
        if(root==null) return;
        if(root.val==val){
             answerNode=root;
             found=true;
        }
        traverse(root.left,val);
        traverse(root.right,val);
    }
    public TreeNode searchBST(TreeNode root, int val) {
        traverse(root,val);
        if(found) return answerNode;
        return null;
    }
}