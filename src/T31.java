import java.util.Stack;

public class T31 {
    class Solution {
        public boolean validateStackSequences(int[] pushed, int[] popped) {
            Stack<Integer> sta = new Stack<>();
            int x = 0;
            for (int i = 0; i < pushed.length; i++) {
                sta.push(pushed[i]);
                while (!sta.isEmpty() && sta.peek() == popped[x]) {
                    sta.pop();
                    x++;
                }
            }
            for (int i = x; i < popped.length; i++) {
                if (sta.pop() != popped[i])
                    return false;
            }
            return true;
        }
    }
}
