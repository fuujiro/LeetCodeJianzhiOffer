import java.util.Stack;

public class T30 {
    class MinStack {
        Stack<Integer> A,B;
        /** initialize your data structure here. */
        public MinStack() {
            A = new Stack<>();
            B = new Stack<>();
        }

        public void push(int x) {
            A.add(x);
            if (B.empty() || B.peek() >= x) {
                B.add(x);
            }
        }

        public void pop() {
            if (A.pop().equals(B.peek()))
                B.pop();
        }

        public int top() {
            return A.peek();
        }

        public int min() {
            return B.peek();
        }
    }

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.min();
 */
}
