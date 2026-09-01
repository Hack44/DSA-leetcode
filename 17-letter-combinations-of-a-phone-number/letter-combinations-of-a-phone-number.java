import java.util.*;
class Solution {
     List<String> letterCombinations(String digits) {
        List<String> ans = new ArrayList<>();
        if (digits.length() == 0) {
            return ans;
        }
        String[] map = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        funct(0, digits, "", map, ans);
        return ans;
    }
    void funct(int i, String digits, String temp, String[] map, List<String> ans) {
        if (i == digits.length()) {
            ans.add(temp);
            return;
        }
        String s = map[digits.charAt(i) - '0'];
        for (int j = 0; j < s.length(); j++) {
            funct(i + 1,digits, temp + s.charAt(j),map,ans);
        }
    }
}