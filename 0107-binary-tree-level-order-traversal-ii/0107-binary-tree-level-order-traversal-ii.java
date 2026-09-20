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
    List<List<Integer>> outer_list=new ArrayList();
    List<Integer> inner_list=new ArrayList();
    public void traverseBFS(TreeNode root){
        Queue<TreeNode> q=new ArrayDeque();
        q.add(root);
        while(!q.isEmpty()){
            int count=q.size();
            inner_list=new ArrayList();
            for(int i=0;i<count;i++){
                TreeNode temp=q.poll();
                inner_list.add(temp.val);
                if(temp.left!=null) q.add(temp.left);
                if(temp.right!=null) q.add(temp.right);
            }
            outer_list.add(inner_list);
        }
    }
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        if(root==null) return new ArrayList();
        traverseBFS(root);
        List<List<Integer>> outer_list_reverse=new ArrayList();
        for(int i=outer_list.size()-1;i>=0;i--){
            outer_list_reverse.add(outer_list.get(i));
        }
        return outer_list_reverse;
    }
}