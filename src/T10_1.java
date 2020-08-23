public class T10_1 {
    class Solution {
        public int fib(int n) {
            int a = 0, b = 1, c = 1;
            for (int i = 1; i <= n; i++) {
                c = (a + b) % 1000000007;
                a = b;
                b = c;
            }
            return a;
        }
    }
}
