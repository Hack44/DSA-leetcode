class Solution {
    Integer[] dp;
    public int rob(int[] nums) {
        dp = new Integer[nums.length];
        return func(nums, 0);
    }
    public int func(int[] nums, int index) {
        if (index >= nums.length) {
            return 0;
        }
        if (dp[index] != null) {
            return dp[index];
        }
        int even = nums[index] + func(nums, index + 2);
        int odd = func(nums, index + 1);
        int ans = Math.max(even, odd);
        dp[index] = ans;
        return ans;
    }
}