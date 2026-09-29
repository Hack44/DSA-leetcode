class Solution {
    int [][] dp;
    public int longestStrChain(String[] words) {
        dp= new int[words.length][words.length+1];
        for(int i=0; i<words.length; i++){
            Arrays.fill(dp[i],-1);
        }
        Arrays.sort(words, (a, b) -> a.length() - b.length());
        return func(words, 0,-1,dp);
    }
    public int func(String[] words, int i, int prev, int[][] dp){
        if(i>= words.length){
            return 0;
        }
        if(dp[i][prev+1] != -1){
            return dp[i][prev+1];
        }
        int take=0;
        if(prev== -1 || check(words[prev], words[i])){
            take = 1+ func(words, i+1,i,dp);
        }
        int skip = func(words, i+1, prev,dp);
        dp[i][prev+1]= Math.max(take, skip);
        return dp[i][prev+1];
    }

    public boolean check( String small, String large){
        if(large.length() != small.length()+1){
            return false;
        }
        int i=0;
        int j=0;
        while(i< small.length() && j< large.length()){
        if(small.charAt(i) == large.charAt(j)){
            i++;
            j++;
        }
        else{
            j++;
        }
        }
        return i== small.length();
    }
}