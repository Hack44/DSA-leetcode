import java.util.*;
class Solution {
    public List<List<Integer>> combinationSum2(int[] nums, int target) {
        Arrays.sort(nums);
        List<Integer> temp = new ArrayList<>();
        List<List<Integer>> ans = new ArrayList<>();
        func(nums, 0, temp, target, ans);
        return ans;
    }

    void func(int[] nums, int ind,List<Integer> temp,int target,List<List<Integer>> ans) {
        if (target == 0) {
            ans.add(new ArrayList<>(temp));
            return;
        }

        for (int i = ind; i < nums.length; i++) {
            if (i > ind && nums[i] == nums[i - 1]) {
                continue;
            }
            if (nums[i] > target) {
                break;
            }
            temp.add(nums[i]);
            func(nums, i + 1,temp,target - nums[i],ans);
            temp.remove(temp.size() - 1);
        }
    }
}

