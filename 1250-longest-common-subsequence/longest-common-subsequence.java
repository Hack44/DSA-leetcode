class Solution {
    int [][] dp;
    public int longestCommonSubsequence(String text1, String text2) {
        dp= new int[1002][1002];
        for(int i=0; i<1002; i++){
            Arrays.fill(dp[i], -1);
        }
       
        int ans =0;
        ans = func(0, 0,  text1, text2,dp );
        return ans;
    }
    int func(int i, int j, String text1, String text2, int [][] dp ){
        if ( i == text1.length() || j== text2.length()){
            return 0;
        }
        if( dp[i][j] != -1){
            return dp[i][j];
        }
        else if( text1.charAt(i) == text2.charAt(j)){
            dp[i][j]= 1+ func( i +1 , j+1, text1, text2,dp);
        }
        else{
            dp[i][j]= Math.max(func(i+1, j, text1, text2,dp ), func(i, j+1, text1, text2, dp));
        }
        return dp[i][j];
    }
}