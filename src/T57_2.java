import java.util.ArrayList;

public class T57_2 {
    class Solution {
        public int[][] findContinuousSequence(int target) {
            int i = 1;
            int j = 1;
            int sum = 0;
            //双指针法
            ArrayList<int[]> res = new ArrayList<>();
            while (i <= target / 2) {
                if (sum < target) {
                    sum += j;
                    j++;
                }
                else if (sum > target) {
                    sum -= i;
                    i++;
                } else {
                    int[] tmp = new int[j - i];
                    int num = 0;
                    for (int k = i; k < j; k++) {
                        tmp[num++] = k;
                    }
                    res.add(tmp);
                    sum -= i;
                    i++;
                }
            }
            return res.toArray(new int[res.size()][]);
        }
    }
}
