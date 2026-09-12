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
    boolean left=true;
    boolean right=true;
    public boolean same(TreeNode one,TreeNode two){
        if(one==null && two==null) return true;
        if(one==null && two!=null || one!=null && two==null ) return false;
        
        
        if(one.val!=two.val) return false;
        if(one.val==two.val) {
            left=left && same(one.left,two.left);
            right=right && same(one.right,two.right);
        }
        return left && right;
    }
    public boolean isSameTree(TreeNode p, TreeNode q) {
        condition=same(p,q);
        return condition;
    }
}