class Solution {
    ArrayList<Integer> AL = new ArrayList<>();

    public void traverse(TreeNode root) {
        if (root == null) return;
        traverse(root.left);
        AL.add(root.val);
        traverse(root.right);
    }

    public TreeNode BST(int l, int r) {
        if (l > r) return null;
        int mid = l + (r - l) / 2;
        TreeNode Head = new TreeNode(AL.get(mid));
        
        // FIX 1: Pass 'l' instead of '0' for the left subtree range
        Head.left = BST(l, mid - 1); 
        Head.right = BST(mid + 1, r);
        return Head;
    }

    public TreeNode deleteNode(TreeNode root, int key) {
        traverse(root);
        
        try {
            AL.remove(Integer.valueOf(key));
        } catch (Exception E) {
            // Handled
        }

        // FIX 2: Use Collections.sort(AL) or AL.sort(Comparator.naturalOrder())
        // Since in-order traversal already yields a sorted array, sorting isn't strictly necessary,
        // but replacing the parameterless call fixes the compile error:
        Collections.sort(AL);

        return BST(0, AL.size() - 1);
    }
}