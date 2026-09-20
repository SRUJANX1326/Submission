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
    List<Double> average_list=new ArrayList();
    public void traverseBFS(TreeNode root){
        Queue<TreeNode> q=new ArrayDeque();
        q.add(root);
        while(!q.isEmpty()){
            double count=q.size();
            double sum=0;
            for(int i=0;i<count;i++){
                TreeNode temp=q.poll();
                sum+=temp.val;
                if(temp.left!=null) q.add(temp.left);
                if(temp.right!=null) q.add(temp.right);
            }
            double average=sum/count;
            average_list.add(average);
        }
    }
    public List<Double> averageOfLevels(TreeNode root) {
        traverseBFS(root);
        return average_list;
    }
}