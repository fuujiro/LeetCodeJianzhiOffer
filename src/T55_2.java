public class T55_2 {

    //  Definition for a binary tree node.
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    class Solution {
        public boolean isBalanced(TreeNode root) {
            if (root == null)
                return true;
            return Math.abs(dfs(root.left)-dfs(root.right)) <= 1 && isBalanced(root.left) && isBalanced(root.right);
        }

        private int dfs(TreeNode root) {
            if (root == null)
                return 0;
            return Math.max(dfs(root.left), dfs(root.right)) + 1;
        }
    }
}
