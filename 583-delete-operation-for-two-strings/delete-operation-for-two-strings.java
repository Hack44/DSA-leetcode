class Solution {
    int [][] dp;
    public int minDistance(String word1, String word2) {
        int n =word1.length();
        int m = word2.length();

        dp = new int[n][m];

        for(int i =0; i<n; i++){
            Arrays.fill(dp[i],-1);
        }
        return n+m - 2*func(word1, word2, 0, 0,dp);
        
    }
    int func(String w1, String w2, int i, int j, int [][] dp){
        
        if(i>= w1.length() || j>= w2.length()){
            return 0;
        }
        if(dp[i][j] != -1){
            return dp[i][j];
        }
        int k=0;
        if(w1.charAt(i) == w2.charAt(j)){
            int a= 1+ func(w1, w2, i+1, j+1,dp);
            k =Math.max(k,a);
        }
        k = Math.max(k, Math.max(func(w1,w2,i+1,j,dp), func(w1,w2, i, j+1,dp)));
        
        return dp[i][j] =k;
    }

}