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
    HashSet<Integer> HS=new HashSet();
    ArrayList<Integer> AL=new ArrayList();
    public void traverse(TreeNode root){
        if(root==null) return;
        HS.add(root.val);
        AL.add(root.val);
        traverse(root.left);
        traverse(root.right);
    }
    public boolean findTarget(TreeNode root, int k) {
        traverse(root);
        for(int i=0;i<AL.size();i++){
            int temp=k-AL.get(i);
            HS.remove(AL.get(i));
            if(HS.contains(temp)) return true;
        }
        return false;
    }
}