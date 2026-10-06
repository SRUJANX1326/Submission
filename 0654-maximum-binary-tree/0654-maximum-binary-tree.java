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
    public TreeNode indexST(int[] nums,int i,int j){
        if(i>j) return null;
        int mid = IntStream.rangeClosed(i, j)
                           .reduce((a, b) -> nums[a] > nums[b] ? a : b)
                           .orElse(-1);
        TreeNode root=new TreeNode(nums[mid]);
        root.left=indexST(nums,i,mid-1);
        root.right=indexST(nums,mid+1,j);
        return root;
    }
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        return indexST(nums,0,nums.length-1);
    }
}