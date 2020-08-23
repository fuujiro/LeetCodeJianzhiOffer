public class T56_1 {
    class Solution {
        public int[] singleNumbers(int[] nums) {
            int mid = 0;
            for (int num: nums) {
                mid ^= num;
            }
            int k = mid & (-mid);
            int[] res = new int[2];
            for (int num : nums) {
                if ((num & k) == 0) {
                    res[0] ^= num;
                } else {
                    res[1] ^= num;
                }
            }
            return res;
        }
    }
}
