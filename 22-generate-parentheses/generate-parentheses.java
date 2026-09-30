class Solution {
    public List<String> generateParenthesis(int n) {
        ArrayList<String> ans = new ArrayList<>();
        func(n, 0 ,0, "", ans);
        return ans;
    }
    public void func(int n,int A, int B, String str, ArrayList<String> ans) {
        if(A> n || B> n || B>A){
            return;
        }
        if (str.length() == 2*n) {
            ans.add(str);
            return;
        }
        if(A < n){
         func(n, A+1 , B , str + "(", ans);
        }
        if(B<A){
        func(n,A, B+1, str + ")", ans);
        }   
    }
}