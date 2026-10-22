class Solution {
    Integer[] dp;
    public int minCostClimbingStairs(int[] cost) {
        dp = new Integer[cost.length];
        return Math.min(func(0, cost),func(1, cost));
    }

    public int func(int index, int[] cost) {
        if (index >= cost.length) {
            return 0;
        }
        if (dp[index] != null) {
            return dp[index];
        }
        int oneStep = func(index + 1, cost);
        int twoStep = func(index + 2, cost);
        return dp[index] = cost[index] + Math.min(oneStep, twoStep);
    }
}