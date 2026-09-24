class Solution {
    int [][] dp;
    public int minimumDeleteSum(String s1, String s2) {
        dp = new int[s1.length()][s2.length()];
        for(int i=0; i< s1.length(); i++){
            Arrays.fill(dp[i],-1);
        }
        return func(s1,s2, 0, 0,dp);
    }
    int func(String s1, String s2, int i, int j, int [][] dp){
        
        if(i>= s1.length()){
            int sum =0;
            for(int k=j ; k<s2.length(); k++){
                sum += s2.charAt(k);
            }
            return sum;
        }
        if(j>= s2.length()){
            int sum =0;
            for(int k=i ; k<s1.length(); k++){
                sum += s1.charAt(k);
            }
            return sum;
        }
        if( dp[i][j] != -1){
            return dp[i][j];
        }
        
        if(s1.charAt(i) == s2.charAt(j)){
            return func(s1,s2,i+1, j+1, dp);
            
        }
        int c1 = s1.charAt(i) + func(s1,s2, i+1,j, dp);
        int c2 = s2.charAt(j) + func(s1,s2, i, j+1, dp);
       
        dp[i][j] = Math.min(c1,c2);
        return dp[i][j];
    }
}