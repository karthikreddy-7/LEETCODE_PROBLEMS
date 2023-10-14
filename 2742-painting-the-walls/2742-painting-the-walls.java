import java.util.HashMap;

class Solution {
    public int paintWalls(int[] cost, int[] time) {
        int n = cost.length;
        return (int) paintWallsHelper(cost, time, 0, 0, new HashMap<>());
    }

    private long paintWallsHelper(int[] cost, int[] time, int index, int total, HashMap<String, Long> memo) {
        if (total >= cost.length)
            return 0;
        if (index >= cost.length)
            return Integer.MAX_VALUE;

        String memoKey = index + "_" + total;
        if (memo.containsKey(memoKey))
            return memo.get(memoKey);

        long with = cost[index] + paintWallsHelper(cost, time, index + 1, total + time[index] + 1, memo);
        long without = paintWallsHelper(cost, time, index + 1, total, memo);
        long result = Math.min(with, without);

        memo.put(memoKey, result);
        return result;
    }
}
