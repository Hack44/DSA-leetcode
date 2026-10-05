class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
         func(n, k, temp, ans, 1);
         return ans;
    }
    public void func(int n, int k, List<Integer>temp ,List<List<Integer>> ans, int i){
        if(temp.size() == k){
            ans.add(new ArrayList<>(temp));
            return ;
        }
        if(i>n){
            return;
        }
        temp.add(i);
        func(n, k, temp, ans, i+1);

        temp.remove(temp.size()-1);
        func(n,k, temp, ans, i+1);
    }
}