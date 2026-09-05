class Solution {
    Integer[][] dp;
    int func(int index, boolean flag, int[] nums) {
        if (index >= nums.length) {
            return 0;
        }
        if (index == nums.length - 1) {
            if (flag == true) {
                return 0;
            }
            return nums[index];
        }
        int state;
        if (flag) {
            state = 1;
        } else {
            state = 0;
        }
        if (dp[index][state] != null) {
            return dp[index][state];
        }

        boolean nflag = flag;
        if (index == 0) {
            nflag = true;
        }
        int take = nums[index] + func(index + 2, nflag, nums);
        int skip = func(index + 1, flag, nums);
        int ans = Math.max(take, skip);
        dp[index][state] = ans;
        return ans;
    }

    public int rob(int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        }
        dp = new Integer[nums.length][2];
        return func(0, false, nums);
    }
}