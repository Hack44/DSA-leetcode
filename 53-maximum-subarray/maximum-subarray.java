class Solution {
    public int maxSubArray(int[] nums) {
        int Sum = nums[0];
        int Max = nums[0];
        for (int i = 1; i < nums.length; i++) {
            Sum = Math.max(nums[i], Sum + nums[i]);
            Max = Math.max(Max, Sum);
        }
        return Max;
    }
}