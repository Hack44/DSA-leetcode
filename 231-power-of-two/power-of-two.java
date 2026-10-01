class Solution {
    public boolean isPowerOfTwo(int n) {
        return func(n);
    }
    public boolean func(int n) {
        if(n == 1) {
            return true;
        }
        if(n <= 0 || n % 2 != 0) {
            return false;
        }
        return func(n / 2);
    }
}