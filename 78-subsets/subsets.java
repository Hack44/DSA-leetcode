class Solution {
    List<List<Integer>> ans = new ArrayList<>();
    void func(List<Integer> nums, List<Integer> temp) {

        ans.add(new ArrayList<>(temp));
        for (int i = 0; i < nums.size(); i++) {
            List<Integer> ip = new ArrayList<>(nums);
            List<Integer> op = new ArrayList<>(temp);

            op.add(nums.get(i));
            for (int j = 0; j <= i; j++) {
                ip.remove(0);
            }
            func(ip, op);
        }
    }

    public List<List<Integer>> subsets(int[] nums) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            list.add(nums[i]);
        }

        func(list, new ArrayList<>());
        return ans;
    }
}