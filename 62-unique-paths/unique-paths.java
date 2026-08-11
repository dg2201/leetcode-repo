import java.util.HashMap;

class Solution {
    HashMap<Long, Integer> memo = new HashMap<>();
    public int uniquePaths(int m, int n) {
        if(m == 1 && n == 1) return 1;
        else if(m<1 || n<1) return 0;
        long key = (long) m * 100001L + n;
        if (memo.containsKey(key)) return memo.get(key);

        int k = uniquePaths(m-1, n);
        int s = uniquePaths(m, n-1);
        int result = s + k;

        memo.put(key, result);
        return result;
    }
}