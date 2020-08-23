public class T10_2 {
    class Solution {
        public int numWays(int n) {
            int a = 1, b = 1, c = 0;
            for (int i = 1; i <= n; i++) {
                c = (a + b) % 1000000007;
                a = b;
                b = c;
            }
            return a;
        }
    }
}
