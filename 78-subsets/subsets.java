class Solution {
    List<List<Integer>> output = new ArrayList<>();
    public List<List<Integer>> subsets(int[] nums) {
        subsets(nums, 0, new ArrayList<>());
        return output;
    }

    public void subsets(int[] nums, int index, List<Integer> current) {
        if (index == nums.length) {
            output.add(new ArrayList<>(current));
            return;
        }
        current.add(nums[index]);
        subsets(nums, index + 1, current);
        current.remove(current.size() - 1);
        subsets(nums, index + 1, current);
    }
}