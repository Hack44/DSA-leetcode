class Solution {
    public int maxLength(int[] nums) {
        int n = nums.length;
        int var =0;
        for(int i = 0; i< n;i++){
            long prod = 1;
            long gcd = nums[i];
            long lcm = nums[i];
            for(int j = i; j < n; j++){
                prod*= nums[j];
                gcd = func(gcd, nums[j]);
                lcm = (lcm / func(lcm, nums[j]))* nums[j];
                if(prod == gcd * lcm){
                    var = Math.max(var, j - i + 1);
                }
            }
        }
        return var;
    }
    public long func(long a, long b){
        while(b != 0){
            long temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
