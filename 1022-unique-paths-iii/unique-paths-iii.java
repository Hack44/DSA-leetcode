class Solution {
    int count=0;
    public int uniquePathsIII(int[][] grid) {

        int n= grid.length;
        int m = grid[0].length;
        
        int si=0;
        int sj =0;
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(grid[i][j] == 0){
                    count ++;
                }
                if(grid[i][j]==1){
                    si =i;
                    sj= j;
                }
            }
        }
       return func(grid, si, sj, n, m, count);
    }
    public int func(int[][] grid, int i, int j, int n, int m , int count){

        if(i>=n ||j>=m || i<0 || j<0 || grid[i][j] == -1 ){
            return 0;
        }
        if(grid[i][j] == 2){
            if(count == 0){
                return 1;
            }
            return 0;
        }
        int nc =count;
        if(grid[i][j] == 0) {
            nc--;
        }
        int ans=0;
        int temp = grid[i][j];
        grid[i][j]= -1;
        int s= func(grid, i+1, j, n, m, nc );
        grid[i][j] = temp;

        int temp2 = grid[i][j];
        grid[i][j]= -1;
        int t= func(grid, i-1, j, n,m, nc);
        grid[i][j] = temp2;

        int temp3 = grid[i][j];
        grid[i][j]= -1;
        int u = func(grid, i, j-1, n, m, nc);
        grid[i][j] = temp3;

        int temp4 = grid[i][j];
        grid[i][j]= -1;
        int k= func(grid, i, j+1, n, m,nc);
        grid[i][j] = temp4;

        ans = s + t + u + k;
       
        return ans;
    }
}