import java.util.HashSet;

public class T03 {
    class Solution {
        public int findRepeatNumber(int[] nums) {
            HashSet<Integer> set = new HashSet<>();
            for (int num : nums) {
                if (!set.add(num))
                    return num;
            }
            throw new IllegalArgumentException("fail");
        }
    }
}
