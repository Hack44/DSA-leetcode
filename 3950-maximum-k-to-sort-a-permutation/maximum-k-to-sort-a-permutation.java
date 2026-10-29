class Solution {
    public int sortPermutation(int[] nums){
        int n = nums.length;
        int ans = -1;
        return func(nums, 0, n, ans);
    }
    public int func(int[] nums, int i, int n, int ans){
        if (i == n){
            if (ans == -1){
                return 0;
            }
            return ans;
        }
        if (nums[i] != i){
            ans = ans & nums[i];
        }
        return func(nums, i + 1, n, ans);
    }
}