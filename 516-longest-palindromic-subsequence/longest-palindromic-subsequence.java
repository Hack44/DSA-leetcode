class Solution {
    int [][] dp =new int[1002][1002];
    public int longestPalindromeSubseq(String s) {
        for(int i = 0; i<=s.length(); i++){
            Arrays.fill( dp[i], -1);
        }
        String t = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            t += s.charAt(i);
        }
        int ans = funct(s, t, 0, 0, dp);
        return ans;
    }

    int funct(String s, String t, int i, int k, int [][] dp) {
    
        if (i >= s.length() || k >= t.length()) {
            return 0;
        }
        if( dp[i][k] != -1){
            return dp[i][k];
        }
        if (s.charAt(i) == t.charAt(k)) {
            int m = 1 + funct(s, t, i + 1, k + 1,dp);
            dp[i][k] = m;
            return dp[i][k];
        }
        int a = funct(s, t, i + 1, k,dp);
        int b = funct(s, t, i, k + 1,dp);
        dp [i][k ]= Math.max(a,b);
        return dp[i][k];
    }
}