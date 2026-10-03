class Solution {
    int [][] dp;
    public int minPathSum(int[][] grid) {
       
        dp = new int[202][202];
        for(int i=0; i<grid.length; i++){
            Arrays.fill(dp[i],-1);
        }
        return func(grid, 0,0,0,0,dp);
    }
    public int func(int[][] grid, int i, int j, int m, int n, int [][] dp){
         m= grid.length;
         n= grid[0].length;
        if(i>=m || j>= n){
            return Integer.MAX_VALUE;
        }
        if(dp[i][j] != -1){
            return dp[i][j];
        }
        if(i == m-1 && j== n-1){
           dp[i][j]= grid[i][j];
           return dp[i][j];
        }
        int right= func(grid, i+1, j, m, n, dp);
        int down =func(grid, i, j+1, m,n, dp);
        dp[i][j]= grid[i][j] + Math.min(right,down);
        return dp[i][j];
    }
}