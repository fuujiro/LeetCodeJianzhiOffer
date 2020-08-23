import java.util.Stack;

public class T06 {

    //Definition for singly-linked list.
    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    class Solution {
        public int[] reversePrint(ListNode head) {
            if (head == null)
                return new int[0];
            Stack<Integer> sta = new Stack<>();
            while (head != null) {
                sta.add(head.val);
                head = head.next;
            }
            int[] res = new int[sta.size()];
            int i = 0;
            while (!sta.isEmpty()) {
                res[i++] = sta.pop();
            }
            return res;
        }
    }
}
