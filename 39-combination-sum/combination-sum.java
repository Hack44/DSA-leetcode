import java .util.*;
class Solution {
    void func(int [] num,int i, int tar, List<Integer> temp, List<List<Integer>> ans){
      
        if(tar == 0){
            ans.add(new ArrayList<>(temp));
                return;
        }
        if(i == num.length || tar <0){
            return;
        }
        temp.add(num[i]);
        
        func(num, i, tar - num[i], temp, ans);
        temp.remove(temp.size() -1);
        func(num, i+1, tar, temp, ans);
        
        }
    
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<Integer> temp = new ArrayList<>();
        List<List<Integer>> ans = new ArrayList<>();
        func(candidates, 0, target, temp, ans);
        return ans;
    }
}