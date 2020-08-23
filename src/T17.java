public class T17 {
    class Solution {
        public int[] printNumbers(int n) {
            if (n < 1)
                return new int[0];
            int size = (int)Math.pow(10,n) - 1;
            int[] res = new int[size];
            for (int i = 0; i < size; i++) {
                res[i] = i + 1;
            }
            return res;
        }
    }
}
