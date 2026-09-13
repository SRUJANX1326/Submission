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
    public boolean same(TreeNode one,TreeNode two){
        if(one==null && two==null) return true;
        if(one==null && two!=null || one!=null && two==null ) return false;
        
        
        if(one.val!=two.val) return false;
        return same(one.left,two.left) && same(one.right,two.right);
    }
    ArrayList<TreeNode> list_name=new ArrayList();
    public void traverse(TreeNode root,TreeNode subRoot){
        if(root==null)  return;
        list_name.add(root);
        traverse(root.left,subRoot);
        traverse(root.right,subRoot);
    }
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        traverse(root,subRoot);
        boolean ans=false;
        for(int i=0;i<list_name.size();i++){
            ans=same(list_name.get(i),subRoot);
            if(ans) break;
            System.out.println(i);
        }
        return ans;
    }
}