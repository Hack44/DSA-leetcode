class Solution {
    int [] dp;
    public int climbStairs(int n) {
        dp = new int[100];
        Arrays.fill(dp, -1);
        return stairs(0, n,dp);
    }
    public int stairs(int curr, int next, int[] dp){
        if(curr > next){
            return 0;
        }
        if(dp[curr] != -1){
            return dp[curr];
        }
        if(curr == next){
            return 1;
        }
      dp[curr] = stairs(curr+1, next,dp) + stairs(curr+2, next, dp);
        return dp[curr] ;
    }
}

