class Solution {
    int [][] dp = new int[102][102];
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int n= obstacleGrid.length;
        int m= obstacleGrid[0].length;
        if(obstacleGrid[0][0] == 1 || obstacleGrid[n-1][m-1]==1 ){
            return 0;
        }
        for(int i=0; i<n; i++){
            Arrays.fill(dp[i],-1);
            
        }
        return func(obstacleGrid, 0, 0,n,m, dp);
    }
    public int func(int[][] temp, int i, int j, int n, int m,int[][] dp){
        if(i>=n || j>= m ||i<0|| j<0 ||  temp[i][j] == 1){
            return 0;
        }
        if(i== n-1 && j== m-1){
            return 1;
        }
        if(dp[i][j]!= -1){
            return dp[i][j];
        }
        int s= func(temp, i+1,j,n,m, dp);
        int k= func(temp, i, j+1,n,m, dp);
        dp[i][j] = s+k;
        return dp[i][j];
    }
}