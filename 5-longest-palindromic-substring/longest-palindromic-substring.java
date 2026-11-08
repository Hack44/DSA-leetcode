class Solution {
public String longestPalindrome(String s){
        int max = 0;
        String ans = "";
        for(int i = 0;i< s.length();i++){
            for(int j = i;j< s.length();j++){
                String sub= s.substring(i, j + 1);
                if(func(sub)){
                    if(sub.length() > max){
                        max = sub.length();
                        ans = sub;
                    }
                }
            }
        }
        return ans;
    }
    public boolean func(String s){
        int left = 0;
        int right = s.length() - 1;
        while(left < right){
            if(s.charAt(left)!= s.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
