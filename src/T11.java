public class T11 {
    class Solution {
        public int minArray(int[] numbers) {
            if (numbers.length == 0)
                return 0;
            for (int i = 1; i < numbers.length; i++) {
                if (numbers[i] < numbers[i - 1])
                    return numbers[i];
            }
            return numbers[0];
        }
    }
}
