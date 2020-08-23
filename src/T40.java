import java.util.PriorityQueue;
import java.util.Queue;

public class T40 {
    class Solution {
        // 大顶堆 O(NlogK) 本题是求前 K 小，因此用一个容量为 K 的大根堆，每次 poll 出最大的数，那堆中保留的就是前 K 小啦（注意不是小根堆！小根堆的话需要把全部的元素都入堆，那是 O(NlogN)O(NlogN)😂，就不是 O(NlogK)O(NlogK)啦～～）
        // 保持堆的大小为K，然后遍历数组中的数字，遍历的时候做如下判断：
        // 1. 若目前堆的大小小于K，将当前数字放入堆中。
        // 2. 否则判断当前数字与大根堆堆顶元素的大小关系，如果当前数字比大根堆堆顶还大，这个数就直接跳过；
        //    反之如果当前数字比大根堆堆顶小，先poll掉堆顶，再将该数字放入堆中。
        public int[] getLeastNumbers(int[] arr, int k) {
            if (k == 0 || arr.length == 0) {
                return new int[0];
            }
            // PriorityQueue 默认小根堆, 实现大根堆需要重写一下比较器。
            Queue<Integer> pq = new PriorityQueue<>((v1,v2)->v2-v1);
            for(int num : arr) {
                if(pq.size() < k) {
                    pq.offer(num);
                } else if (num < pq.peek()){
                    pq.poll();
                    pq.offer(num);
                }
            }
            int[] res = new int[pq.size()];
            int idx = 0;
            for (int num : pq) {
                res[idx++] = num;
            }
            return res;
        }
    }
}
