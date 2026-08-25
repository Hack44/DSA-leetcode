class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            list.add(nums[i]);
        }
        func(list, new ArrayList<>());
        return ans;
    }
    List<List<Integer>> ans = new ArrayList<>();
    void func(List<Integer> nums, List<Integer> temp) {
        if (nums.size() == 0) {
            ans.add(new ArrayList<>(temp));
            return;
        }
        for (int i = 0; i < nums.size(); i++) {
            List<Integer> ip = new ArrayList<>(nums);
            List<Integer> op = new ArrayList<>(temp);
            op.add(nums.get(i));
            ip.remove(i);
            func(ip, op);
        }
    }
}