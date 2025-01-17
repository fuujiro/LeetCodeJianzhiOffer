public class T54 {

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
        //中序遍历
        int res, k;
        public int kthLargest(TreeNode root, int k) {
            this.k = k;
            dfs(root);
            return res;
        }
        private void dfs(TreeNode root) {
            if (root == null)
                return;
            dfs(root.right);
            if (k == 0)
                return;
            if (--k == 0)
                res = root.val;
            dfs(root.left);
        }
    }
}
