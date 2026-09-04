class Solution {
    Integer[] dp;
    public int fib(int n) {
        dp = new Integer[n + 1];
        return func(n);
    }
    public int func(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        if (dp[n] != null) {
            return dp[n];
        }
        int first = func(n - 1);
        int second = func(n - 2);
        dp[n] = first + second;
        return dp[n];
    }
}