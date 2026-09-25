class Solution {
    Boolean [][][] dp;
    public boolean isInterleave(String s1, String s2, String s3) {
        dp= new Boolean[s1.length()+1][s2.length()+1][s3.length()+1];
       
        if(s1.length() + s2.length() != s3.length()){
            return false;
        }
        return func(s1, s2,s3,0,0,0, dp);
    }
    public boolean func(String s1, String s2, String s3, int i, int j, int k, Boolean[][][] dp){
        if(i>= s1.length()){
            for(int l=j ; l<s2.length(); l++){
                if(s2.charAt(l) != s3.charAt(k)){
                    return false;
                }
                k++;
            }
            return true;
        }
        if(j>= s2.length()){
            for(int l=i ; l<s1.length(); l++){
                if(s1.charAt(l) != s3.charAt(k)){
                    return false;
                }
                k++;
            }
            return true;
        }
        if(dp[i][j][k] != null){
            return dp[i][j][k];
        }
        
        if(i<s1.length() && s1.charAt(i) == s3.charAt(k)){
            if(func(s1, s2, s3, i+1, j, k+1,dp)){
                dp[i][j][k]= true;
                return dp[i][j][k];
            }
            
        }
        if(j< s2.length() && s2.charAt(j) == s3.charAt(k)){
            if(func(s1, s2, s3, i, j+1, k+1, dp)){
                dp[i][j][k]= true;
                return dp[i][j][k];

            }
            
        }
        if(s1.charAt(i) != s3.charAt(k) || s2.charAt(j) != s3.charAt(k) ){
            dp[i][j][k]= false;
            return dp[i][j][k];
        }
        return dp[i][j][k]= false;
    }
}