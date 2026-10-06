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
    public  void traverse(TreeNode root){
        if(root==null) return;
        traverse(root.left);
        AL.add(root.val);
        traverse(root.right);

    }
    public int getMinimumDifference(TreeNode root) {
        traverse(root);
        int all_min=Integer.MAX_VALUE;
        for(int i=0;i<AL.size();i++){
            for(int j=i+1;j<AL.size();j++){
                int min=AL.get(j)-AL.get(i);
                if(min<all_min) all_min=min;
            }
        }
        return all_min;
    }
}