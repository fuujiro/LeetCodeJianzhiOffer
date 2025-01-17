public class T15 {
    public class Solution {
        // you need to treat n as an unsigned value
        public int hammingWeight(int n) {
            int res = 0;
            while (n != 0) {
                res += n & 1;
                n >>>= 1;
            }
            return res;
        }
    }
}
