class Solution {
    public int smallestIndex(int[] nums) {
        return func(nums, 0);
    }
    public int func(int[] nums, int i){
        if(i>= nums.length){
            return -1;
        }
        int s=0;
        while (nums[i] >0){
            s += nums[i] %10;
            nums[i]= nums[i]/10;
        }
        if(s==i){
            return i;
        }
        
       return func(nums, i+1);
    }
}