import java.util.*;
class Solution {
    List<List<Integer>> ans = new ArrayList<>();
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            list.add(nums[i]);
        }
        Collections.sort(list);
        func(list, new ArrayList<>());
        return ans;
    }

    void func(List<Integer> nums, List<Integer> temp) {
        if (nums.size() == 0) {
            ans.add(new ArrayList<>(temp));
            return;
        }
        for (int i = 0; i < nums.size(); i++) {
            if (i > 0 && nums.get(i).equals(nums.get(i - 1))) {
                continue;
            }
            List<Integer> ip = new ArrayList<>(nums);
            List<Integer> op = new ArrayList<>(temp);
            op.add(nums.get(i));
            ip.remove(i);
            func(ip, op);
        }
    }
}