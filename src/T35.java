import java.util.HashMap;
import java.util.Map;

public class T35 {

    // Definition for a Node.
    class Node {
        int val;
        Node next;
        Node random;

        public Node(int val) {
            this.val = val;
            this.next = null;
            this.random = null;
        }
    }

    class Solution {
        public Node copyRandomList(Node head) {
            if(head == null) {
                return null;
            }
            Map<Node, Node> visited = new HashMap<>();
            Node cHead = new Node(head.val), cur = cHead;
            visited.put(head, cHead);
            while(head != null) {
                if(head.next != null) {
                    if(visited.get(head.next) == null) {
                        cur.next = new Node(head.next.val);
                        visited.put(head.next, cur.next);
                    } else {
                        cur.next = visited.get(head.next);
                    }
                }
                if(head.random != null) {
                    if(visited.get(head.random) == null) {
                        cur.random = new Node(head.random.val);
                        visited.put(head.random, cur.random);
                    } else {
                        cur.random = visited.get(head.random);
                    }
                }
                cur = cur.next;
                head = head.next;
            }
            return cHead;
        }
    }
}
