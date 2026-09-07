class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashSet<Integer> set = new HashSet<>();
        return func(nums, k, 0, set);
    }

    boolean func(int[] nums, int k, int index, HashSet<Integer> set) {
        if (index == nums.length) {
            return false;
        }
        if (set.contains(nums[index])) {
            return true;
        }

        set.add(nums[index]);
        if (index >= k) {
            set.remove(nums[index - k]);
        }
        return func(nums, k, index + 1, set);
    }
}