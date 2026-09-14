class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        return func(nums, target, 0, 0);
    }

    int func(int[] nums, int target, int index, int sum) {
        if (index == nums.length) {
            if (sum == target) {
                return 1;
            }
            return 0;
        }

        int plus = func(nums, target, index + 1, sum + nums[index]);
        int minus = func(nums, target, index + 1, sum - nums[index]);

        return plus + minus;
    }
}