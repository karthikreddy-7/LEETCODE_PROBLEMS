class Solution {
    public int climbStairs(int n) {
        HashMap<Integer,Integer> map=new HashMap<>();
        return helper(n,map);
    }
    public int helper(int n, HashMap<Integer, Integer> map) {
        if (n == 0) return 1;
        if (n < 0) return 0;
        
        if (map.containsKey(n)) {
            return map.get(n);
        }
        
        int steps = helper(n - 1, map) + helper(n - 2, map);
        map.put(n, steps);
        return steps;
    }
}