public class T04 {
    class Solution {
        public boolean findNumberIn2DArray(int[][] matrix, int target) {
            if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
                return false;
            }
            int x = matrix.length;
            int y = matrix[0].length;
            int i = 0, j = y - 1;
            while (i < x && j >= 0) {
                if (matrix[i][j] > target)
                    j--;
                else if (matrix[i][j] < target)
                    i++;
                else
                    return true;
            }
            return false;
        }
    }
}
