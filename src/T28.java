public class T28 {

    //Definition for a binary tree node.
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    class Solution {
        public boolean isSymmetric(TreeNode root) {
            return root == null? true : recur(root.left, root.right);
        }
        private boolean recur (TreeNode L, TreeNode R) {
            if (L == null && R ==null) return true;
            if (L == null || R == null || L.val != R.val) return false;
            return recur(L.left,R.right) && recur(L.right, R.left);
        }
    }
}
