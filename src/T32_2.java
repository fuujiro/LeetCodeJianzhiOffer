import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class T32_2 {

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
        public List<List<Integer>> levelOrder(TreeNode root) {
            Queue<TreeNode> queue = new LinkedList<>();
            List<List<Integer>> res = new ArrayList<>();
            if(root != null) queue.add(root);
            while(!queue.isEmpty()) {
                List<Integer> tmp = new ArrayList<>();
                for(int i = queue.size(); i > 0; i--) {
                    TreeNode node = queue.poll();
                    tmp.add(node.val);
                    if(node.left != null) queue.add(node.left);
                    if(node.right != null) queue.add(node.right);
                }
                res.add(tmp);
            }
            return res;
        }
    }
}
