class Solution {
    int [][] dp;
    public int lengthOfLIS(int[] nums) {
        dp = new int[nums.length][nums.length+1];
        for(int i=0; i<nums.length; i++){
            Arrays.fill(dp[i], -1);
        }
        return func(nums, 0, -1, dp);
    }
    int func(int [] nums, int i, int p, int [][] dp){
        if(i>= nums.length){
            return 0;
        }  
        if(dp[i][p +1]!= -1){
            return dp[i][p +1];
        }     
        int a=0;
        if( p== -1 || nums[i] > nums[p]){
          a = 1+ func( nums, i+1, i, dp);
        }
        int b= func(nums, i+1, p, dp);
        dp[i][p +1]= Math.max(a,b);
        return dp[i][p+1];
    }
    
}