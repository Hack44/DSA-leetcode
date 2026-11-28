class Solution {
    public int findCircleNum(int[][] isConnected) {
        int n= isConnected.length;
        boolean[] visit = new boolean[n];
        int ans = 0;
        for(int i=0; i<n; i++){
            if(!visit[i]){
                ans++;
                 func(i, isConnected, visit);
            }
        }
       return ans;
    }
    public void func( int str, int[][] isConnected, boolean[] visit){
        visit[str] = true;
        for(int neighbour=0; neighbour < isConnected.length; neighbour ++){
            if(isConnected[str][neighbour] ==1 && !visit[neighbour]){
                func(neighbour, isConnected, visit);
            }
        }

    }
}
