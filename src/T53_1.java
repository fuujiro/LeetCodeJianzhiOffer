import java.util.HashMap;

public class T53_1 {
    class Solution {
        public int search(int[] nums, int target) {
            HashMap<Integer,Integer> hm = new HashMap<>();
            for (int num : nums) {
                if (!hm.containsKey(num)) {
                    hm.put(num,1);
                } else {
                    hm.put(num,hm.get(num)+1);
                }
            }
            if (hm.containsKey(target))
                return hm.get(target);
            else
                return 0;
        }
    }
}
