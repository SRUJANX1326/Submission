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
    ArrayList<Integer> one=new ArrayList();
    ArrayList<Integer> two=new ArrayList();
    ArrayList<Integer> temp=new ArrayList();
    boolean condition=true;
    public void traverseList(TreeNode root){
        if(root==null) return;
        temp.add(root.val);
        traverseList(root.left);
        traverseList(root.right);
    }
    public void traverse(TreeNode root){
        if(condition==false) return;
        if(root==null) return;
        temp=new ArrayList();
        one=new ArrayList();
        traverseList(root.left);
        one=temp;
        temp=new ArrayList();
        two=new ArrayList();
        traverseList(root.right);
        two=temp;
        for(int i=0;i<one.size();i++){
            if(one.get(i)>=root.val){
                condition=false;
                return;
            }
        }
        for(int i=0;i<two.size();i++){
            if(two.get(i)<=root.val){
                condition=false;
                return;
            }
        }
        traverse(root.left);
        traverse(root.right);
    }
    public boolean isValidBST(TreeNode root) {
        traverse(root);
        return condition;
    }
}