import java.util.HashSet;
import java.util.Set;

public class T61 {
    class Solution {
        public boolean isStraight(int[] nums) {
            Set<Integer> Col = new HashSet<>();
            int max = 0, min =14;
            for (int num :  nums) {
                if (num == 0)
                    continue;
                max = Math.max(max,num);
                min = Math.min(min,num);
                if (Col.contains(num))
                    return false;
                Col.add(num);
            }
            return max - min < 5;
        }
    }
}
