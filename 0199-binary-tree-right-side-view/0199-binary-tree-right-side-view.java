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
    List<Integer> ANS=new ArrayList();
    public void traverse(TreeNode root){
        if(root==null) return;
        Queue<TreeNode> q=new ArrayDeque();
        q.add(root);
        while(!q.isEmpty()){
            
            int count=q.size();
            for(int i=0;i<count;i++){
                TreeNode current=q.poll();
                if(i==count-1){
                    ANS.add(current.val);
                }
                if(current.left!=null) q.add(current.left);
                if(current.right!=null) q.add(current.right);
            }
        }
    }
    public List<Integer> rightSideView(TreeNode root) {
        traverse(root);
        return ANS;
    }
}