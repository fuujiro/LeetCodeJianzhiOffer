import java.util.HashSet;
import java.util.Set;

public class T48 {
    class Solution {
        public int lengthOfLongestSubstring(String s) {
            // 滑动窗口 + 双指针法
            Set<Character> set = new HashSet<>();
            int left = 0, right = 0, res = 0;
            while (right < s.length()) {
                char c = s.charAt(right++);
                while (set.contains(c)) {
                    set.remove(s.charAt(left++));
                }
                set.add(c);
                res = Math.max(res, right - left);
            }
            return res;
        }
    }
}
