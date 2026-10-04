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
    int max_sum = Integer.MIN_VALUE;
    int level;

    public void BFS(TreeNode root) {
        Queue<TreeNode> q = new ArrayDeque();
        q.add(root);
        int current_level=1;
        while (!q.isEmpty()) {
            int sum = 0;
            int count=q.size();
            for (int i = 0; i < count; i++) {
                TreeNode temp = q.poll();
                System.out.println("Level" + current_level + "Nodes" +temp.val);
                sum += temp.val;
                if (temp.left != null)
                    q.add(temp.left);
                if (temp.right != null)
                    q.add(temp.right);
                
            }
            System.out.println("Level" + current_level);
            System.out.println(sum);
            if (max_sum < sum) {
                max_sum = sum;
                level=current_level;
            }
            
            current_level++;
        }
    }

    public int maxLevelSum(TreeNode root) {
        BFS(root);
        return level;
    }
}