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
    ArrayList<TreeNode> node = new ArrayList();
    HashMap<Integer,Integer> HM = new HashMap();

    public void traverse(TreeNode root) {
        if (root == null)
            return;
        traverse(root.left);
        node.add(root);
        traverse(root.right);
    }
    public void greaterTree(TreeNode root) {
        if (root == null)
            return;
        root.val=HM.get(root.val);
        greaterTree(root.left);
        greaterTree(root.right);
    }
    public TreeNode convertBST(TreeNode root) {
        traverse(root);
        for (int i = 0; i < node.size(); i++) {
            int sum=node.get(i).val;
            for (int j = 0; j < node.size(); j++) {
                if(node.get(j).val>node.get(i).val){
                    sum+=node.get(j).val;
                }
            }
            HM.put(node.get(i).val,sum);
        }
        greaterTree(root);
        return root;
    }
}