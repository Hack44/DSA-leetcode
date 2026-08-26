import java.util.HashSet;
class Solution {

    boolean funct(int n, HashSet<Integer> set){
        if(n==1){
            return true;
        }
        if(set.contains(n)){
            return false;
        }
        set.add(n);

        int sum =0;
        while(n>0){
             int digit = n % 10;
            sum += digit * digit;
            n= n/10;
        }
           return funct(sum, set);
    }
    
    public boolean isHappy(int n) {
        HashSet<Integer> set = new HashSet<>();
        return funct( n,  set);
    }
}