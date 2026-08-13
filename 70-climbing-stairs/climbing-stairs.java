class Solution {
    public int stairs(int n, int[] memo){
        if(n == 0) return 1;
        if(n == 1) return 1;

        if(memo[n] != -1)
            return memo[n];
        return memo[n] = stairs(n-1, memo) + stairs(n-2, memo);
    }

    public int climbStairs(int n) {
        int[] memo = new int[n+1];
        Arrays.fill(memo, -1);
        return stairs(n, memo);
    }
}