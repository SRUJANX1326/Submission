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
    List<List<Integer>> ANS= new ArrayList();
    public void BFS(TreeNode root){
        if(root==null) return;
        Queue<TreeNode> q=new ArrayDeque();
        q.add(root);
        while(!q.isEmpty()){
            int count=q.size();
            ArrayList<Integer> temp= new ArrayList();
            for(int i=0;i<count;i++){
                TreeNode current=q.poll();
                temp.add(current.val);
                if(current.left!=null) q.add(current.left);
                if(current.right!=null) q.add(current.right);
            }
            ANS.add(temp);
        }
    }
    public List<List<Integer>> levelOrder(TreeNode root) {
        BFS(root);
        return ANS;
    }
}