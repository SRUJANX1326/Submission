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
    public TreeNode BST(int l,int r){
        if(l>r) return null;
        int mid=l+(r-l)/2;
        TreeNode Head=new TreeNode(AL.get(mid));
        Head.left=BST(l,mid-1);
        Head.right=BST(mid+1,r);
        return Head;
    }
    public TreeNode deleteNode(TreeNode root, int key) {
        traverse(root);
        try{
            AL.remove(Integer.valueOf(key));
        }catch(Exception E){

        }
  
        return BST(0,AL.size()-1);
    }
}