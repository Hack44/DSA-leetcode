class Solution {
    int [][] dp;
    public int findLongestChain(int[][] pairs) {
        dp = new int[ pairs.length][pairs.length+1];
        Arrays.sort(pairs, (a, b) -> a[0] - b[0]);
        for(int i=0; i< pairs.length; i++){
            Arrays.fill(dp[i], -1);
        }
        int ans = func(pairs, 0, -1, dp);
        return ans;
    }
    public int func(int [][] pairs, int i, int prev, int [][] dp){
       
        if(i>= pairs.length){
            return 0;
        }
        if(dp[i][prev+1] != -1){
            return dp[i][prev+1];
        }
        int take =0;
        if(prev == -1 || pairs[prev][1] < pairs[i][0]){
            take = 1 + func(pairs, i+1, i,dp);
            
        }
        int skip = func(pairs, i + 1, prev, dp);
        dp[i][prev+1]= Math.max(take, skip);
        return dp[i][prev+1];
    }

}