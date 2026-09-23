class Solution {
    int [][] dp;
    public int maxUncrossedLines(int[] nums1, int[] nums2) {
        dp = new int[nums1.length][nums2.length];
        for(int i= 0; i<nums1.length; i++){
            Arrays.fill(dp[i],-1);
        }
        return func(0, 0, nums1, nums2, dp);
    }

    int func(int i, int j, int[] nums1, int[] nums2, int [][] dp) {
        if (i == nums1.length || j == nums2.length) {
            return 0;
        }
        if(dp[i][j] != -1){
            return dp[i][j];
        }
        if (nums1[i] == nums2[j]) {
            dp[i][j] = 1 + func(i + 1, j + 1, nums1, nums2,dp);
            return dp[i][j];
        }
        dp[i][j]= Math.max(func(i + 1, j, nums1, nums2,dp),func(i, j + 1, nums1, nums2,dp));
        return dp[i][j];
    }
}