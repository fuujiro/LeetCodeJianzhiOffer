public class T18 {

    //Definition for singly-linked list.
    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    class Solution {
        // 双指针法
        public ListNode deleteNode(ListNode head, int val) {
            // 初始一个虚拟节点
            ListNode dum = new ListNode(0);
            // 虚拟节点指向head
            dum.next = head;
            ListNode cur = head;
            ListNode pre = dum;
            while (cur != null) {
                // 找到要删除的节点
                if (cur.val == val) {
                    pre.next = cur.next;
                    break;
                }
                //如果没找到都往后退
                pre = cur;
                cur = cur.next;
            }
            return dum.next;
        }
    }
}
