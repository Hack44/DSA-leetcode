class Solution {
    public int minAddToMakeValid(String s) {
        int A = 0;
        int B = 0;
        return func(s, A, B);
    }

    public int func(String s, int A, int B) {
        if (s.length() == 0) {
            return A + B;
        }

        if (s.charAt(0) == '(') {
            A++;
        }
        else {
            if (A > 0) {
                A--;
            }
            else {
                B++;
            }
        }
        return func(s.substring(1), A, B);
    }
}