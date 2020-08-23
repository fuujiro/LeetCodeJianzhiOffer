public class T53_2 {
    class Solution {
        public int missingNumber(int[] nums) {
            int[] templ = new int[nums.length];
            for (int i = 0; i < nums.length; i++) {
                templ[i] = i;
            }
            for (int i = 0; i < nums.length; i++) {
                 if (nums[i] != templ[i]) {
                     return templ[i];
                 }
            }
            return nums[nums.length-1]+1;
        }
    }
}
