import java.util.*;
class Solution {
    boolean func(int[] nums, List<Integer> temp, List<Integer> temp2) {
        for (int i = 0; i < nums.length; i++) {
            if (!temp.contains(nums[i])) {
                temp.add(nums[i]);
            }
            else if (!temp2.contains(nums[i])) {
                temp2.add(nums[i]);
            }
            else { return false;
            }
        }

        return true;
    }

    public boolean isPossibleToSplit(int[] nums) {
        List<Integer> temp = new ArrayList<>();
        List<Integer> temp2 = new ArrayList<>();

        return func(nums, temp, temp2);
    }
}