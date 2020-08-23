import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class T32_1 {

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
        public int[] levelOrder(TreeNode root) {
            if (root == null)
                return new int[0];
            Queue<TreeNode> queue = new LinkedList<>();
            ArrayList<Integer> res = new ArrayList<>();
            queue.add(root);
            while (!queue.isEmpty()) {
                TreeNode node = queue.poll();
                res.add(node.val);
                if (node.left != null)
                    queue.add(node.left);
                if (node.right != null)
                    queue.add(node.right);
            }
            int[] ress = new int[res.size()];
            for (int i = 0; i < res.size(); i++) {
                ress[i] = res.get(i);
            }
            return ress;
        }
    }
}
