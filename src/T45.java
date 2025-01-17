import java.util.Arrays;

public class T45 {
    class Solution {
        public String minNumber(int[] nums) {
            String[] strs = new String[nums.length];
            for (int i = 0; i < nums.length; i++) {
                strs[i] = String.valueOf(nums[i]);
            }
            Arrays.sort(strs,((o1, o2) -> (o1 + o2).compareTo(o2 + o1)));
            StringBuilder res = new StringBuilder();
            for (int i = 0; i < strs.length; i++) {
                res.append(strs[i]);
            }
            return res.toString();
        }
    }
}
