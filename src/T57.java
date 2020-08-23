import java.util.HashMap;

public class T57 {
    class Solution {
        /*        public int[] twoSum(int[] nums, int target) {
                    HashMap<Integer, Integer> hm = new HashMap<>();
                    for (int i = 0; i < nums.length; i++) {
                        hm.put(nums[i], i);
                    }
                    for (int i = 0; i < nums.length; i++) {
                        int tmp = target - nums[i];
                        if (hm.containsKey(tmp) && hm.get(tmp) != i) {
                            return new int[]{nums[i],tmp};
                        }
                    }
                    throw new IllegalArgumentException("fail");
                }*/
        //双指针法 空间复杂度可优化至O(1)
        public int[] twoSum(int[] nums, int target) {
            int i = 0, j = nums.length - 1;
            while (i < j) {
                int sum = nums[i] + nums[j];
                if (sum < target)
                    i++;
                else if (sum > target)
                    j--;
                else
                    return new int[]{nums[i],nums[j]};
            }
            throw new IllegalArgumentException("fail");
        }
    }
}
