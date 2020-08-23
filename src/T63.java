public class T63 {
    class Solution {
        public int maxProfit(int[] prices) {
            int res = 0;
            int tmp = 0;
            for (int i = 1; i < prices.length; i++) {
                if (prices[i] < prices[tmp])
                    tmp = i;
                else
                    res = Math.max(res,prices[i] - prices[tmp]);
            }
            return res;
        }
    }
}
