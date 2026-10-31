import java.util.*;
class Solution {
    public int hIndex(int[] citations) {
        Arrays.sort(citations);
        return func(citations);
    }
    public int func(int[] c) {
        int n = c.length;
        for (int i = 0; i < n; i++) {
            int h = n - i;
            if (c[i] >= h) {
                return h;
            }
        }
        return 0;
    }
}