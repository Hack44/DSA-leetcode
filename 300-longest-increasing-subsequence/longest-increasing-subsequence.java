class Solution {
    int [][] dp;
    public int lengthOfLIS(int[] nums) {
        dp= new int[nums.length][nums.length+1];
        for(int i=0; i<nums.length; i++){
            Arrays.fill(dp[i],-1);
        }
        return func(nums, 0, -1,dp);
    }
    int func(int [] nums, int i,int p, int[][] dp){
        if(i>= nums.length){
            return 0;
        } 
        if(dp[i][p+1]!= -1){
            return dp[i][p+1];
        }
           
        int M=0;
        for(int j=i; j<nums.length; j++){
            if( p== -1 || nums[j] > nums[p]){
            int a = 1+ func( nums, j+1, j,dp);
             M = Math.max(M,a);
         }
        }
        dp[i][p+1] =M;
        return dp[i][p+1];
    }
    
}