import java.util.HashMap;

class Solution {
    int climb(int n, HashMap<Integer, Integer> m) {
        if(m.containsKey(n)){
            return m.get(n);
        }

        else{
            int result = climb(n - 1, m) + climb(n - 2, m);
            m.put(n, result);   // <-- store it here, before returning
            return result;
        }
    }
    public int climbStairs(int n) {
        HashMap <Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        map.put(-1, 0);
        int num=n;
        return climb(num, map);


    }
}