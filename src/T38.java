import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

public class T38 {
    class Solution {
        List<String> res = new LinkedList<>();
        char[] c;
        public String[] permutation(String s) {
            c = s.toCharArray();
            dfs(0);
            return res.toArray(new String[res.size()]);
        }
        void dfs(int x) {
            if (x == c.length - 1) {
                res.add(String.valueOf(c));
                return;
            }
            HashSet<Character> set = new HashSet<>();
            for (int i = x; i < c.length; i++) {
                if (set.contains(c[i])) continue;
                set.add(c[i]);
                swap(i,x);
                dfs(x+1);
                swap(i,x);
            }
        }
        void swap(int a,int b) {
            char tmp = c[a];
            c[a] = c[b];
            c[b] = tmp;
        }
    }
}
