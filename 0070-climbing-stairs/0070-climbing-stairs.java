import java.util.HashMap;

class Solution {
    public int climbStairs(int n) {
        return helper(n, new HashMap<>());
    }

    public int helper(int n, HashMap<Integer, Integer> memo) {
        if (n == 0) {
            return 1;
        }
        if (n < 0) {
            return 0;
        }
        if (memo.containsKey(n)) {
            return memo.get(n);
        }

        int ways = helper(n - 1, memo) + helper(n - 2, memo);
        memo.put(n, ways); // Memoize the result for n
        return ways;
    }
}
