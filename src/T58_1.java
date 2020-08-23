public class T58_1 {
    class Solution {
        public String reverseWords(String s) {
            String[] tmp = s.trim().split(" ");
            String res = "";
            for (int i = tmp.length - 1; i >= 0; i--) {
                if (tmp[i].equals(""))
                    continue;
                res += tmp[i] + " ";
            }
            return res.trim();
        }
    }
}
