class Solution {
    public int maxSumAfterPartitioning(int[] arr, int k) {

        int n = arr.length;
        int [][] dp = new int[n][n];

        for(int i=0; i<arr.length; i++){
                Arrays.fill(dp[i], -1);
            }
        
        return func( arr, k, 0, 0,0,dp);
    }
    public int func(int[] arr, int k, int index, int prev, int Max, int[][] dp){

        if(index == arr.length){
            return 0;
        }

        if(dp[index][prev] != -1){
            return dp[index][prev];
        }

        Max = Math.max(Max, arr[index]);
        
        int len = index - prev + 1;
        int ans = 0;

        if(len == k){
            int c1= (Max*len)+ func(arr, k ,index+1, index +1, 0, dp);
            ans = Math.max( ans, c1);
        }
        else{
            int c1= (Max*len)+ func(arr, k ,index+1, index +1, 0, dp);
            int c2=  func(arr, k ,index+1, prev, Max, dp);
             ans = Math.max( ans, c1);
             ans = Math.max( ans, c2);
        }
        dp[index][prev] = ans;
        return ans;
    }
}