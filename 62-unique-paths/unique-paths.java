class Solution {
    int[][] dp;
    public int uniquePaths(int m, int n) {
        dp= new int[101][101];
        for(int i=0;i<m;i++){
            Arrays.fill(dp[i],-1);
        }
        return func(m,n,0,0, dp);
    }
    public int func(int m, int n, int i, int j, int[][] dp){
        if(i>= m || j>=n){
            return 0;
        }
        if(i==m-1 && j==n-1){
            return 1;
        }
        if(dp[i][j] != -1){
            return dp[i][j];
        }
        int t= func(m, n, i+1,j,dp);
        int nk= func(m,n,i,j+1,dp);
        dp[i][j] = t+nk;

        return dp[i][j];
    }
}