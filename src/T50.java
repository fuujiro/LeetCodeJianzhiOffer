import java.util.HashMap;

public class T50 {
    class Solution {
        public char firstUniqChar(String s) {
            HashMap<Character, Boolean> dic = new HashMap<>();
            char[] sc = s.toCharArray();
            for (char c : sc)
                dic.put(c,!dic.containsKey(c));
            for (char c : sc)
                if (dic.get(c))
                    return c;
            return ' ';
        }
    }
}
