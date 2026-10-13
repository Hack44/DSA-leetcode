class Solution {
    int [][] dp;
    public int minFallingPathSum(int[][] matrix) {
         int m = matrix.length;
        int n= matrix[0].length;
        dp = new int[m][n];

        for(int i =0; i<m; i++){
            for(int j=0; j<n; j++){
                dp[i][j] = -99999;
            }
        }
        int ans = Integer.MAX_VALUE;
        for(int j=0; j<n; j++){
             ans= Math.min(ans, func(matrix, 0,j,m,n, dp));
        }
        return ans;
    }
    public int func( int[][] temp, int i, int j, int m, int n, int[][] dp){
        m = temp.length;
        n= temp[0].length;

        if( i<0 || j<0 || i>= m || j>= n){
            return Integer.MAX_VALUE /2;
        }
        if(dp[i][j] != -99999){
            return dp[i][j];
        }
        if( i== m-1 ){
            return dp[i][j]= temp[i][j];
        }
        int left = func(temp, i+1, j-1, m, n,dp);
        int right = func(temp, i+1, j, m, n,dp);
        int down = func(temp, i+1, j+1, m, n,dp);

        dp[i][j]= temp[i][j] + Math.min(left, Math.min(right, down));
        return dp[i][j];
    }
}