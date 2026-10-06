class Solution {
    public long countIntersectingIntervals(int[][] intervals) {
        return func(intervals);
    }

    public long func(int[][] temp){
        int n = temp.length;
        int [] st= new int[n];
        int [] end=new int[n];
        for(int i=0; i<n; i++){
            st[i] = temp[i][0];
            end[i] = temp[i][1];
        }
        Arrays.sort(st);
        Arrays.sort(end);
        long co=0;
        int j=0;
        for(int i=0; i<n ; i++){
            while(j<n && end[j]<st[i]){
                j++;
            }
            co += i -j;
        }
       return co;
    }
}