class Solution {
    public boolean isPalindrome(String s) {
        boolean result = funct(s);
        return result;
    }
    boolean funct(String s) {
        String chk = "";
        for (int i = 0; i < s.length(); i++) {
            if (Character.isLetterOrDigit(s.charAt(i))) {
                chk= chk + Character.toLowerCase(s.charAt(i));
            }
        }
        String rev = "";
        for (int i = chk.length() - 1; i >= 0; i--) {
            rev = rev + chk.charAt(i);
        }
        return chk.equals(rev);
    }
}