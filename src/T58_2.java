public class T58_2 {
    class Solution {
        /*        public String reverseLeftWords(String s, int n) {
                    String res = "";
                    for (int i = n; i < s.length(); i++) {
                        res += s.charAt(i);
                    }
                    for (int i = 0; i < n; i++) {
                        res += s.charAt(i);
                    }
                    return res;
                }*/
        public String reverseLeftWords(String s, int n) {
            return s.substring(n, s.length()) + s.substring(0, n);
        }
    }
}
