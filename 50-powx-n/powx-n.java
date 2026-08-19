class Solution {
    public double myPow(double x, int n) {
        long l = n;
        if (l < 0) {
            x = 1 / x;
            l = -l;
        }

        double ans = 1.0;

        while (l > 0) {
            if ((l % 2) == 1) {  
                ans *= x;
            }
            x *= x;   
            l /= 2;   
        }

        return ans;
    }
}