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
    ArrayList<Integer> list_name=new ArrayList();
    public void traverse(TreeNode root){
        if(root==null) return;
        traverse(root.left);
        list_name.add(root.val);
        traverse(root.right);
    }
    public TreeNode increasingBST(TreeNode root) {
        traverse(root);
        TreeNode Head=new TreeNode();
        TreeNode StoredHead=Head;
        int i=-1;
        for(i=0;i<list_name.size()-1;i++){
            Head.val=list_name.get(i);
            Head.left=null;
            Head.right=new TreeNode();
            Head=Head.right;
        }
        Head.val=list_name.getLast();
        return StoredHead;
    }
}