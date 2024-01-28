class Solution {
    public int numEnclaves(int[][] grid) {
        int res=0;
        int r=grid.length;
        int c=grid[0].length;
        
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(i==0||j==0||i==r-1||j==c-1)
                    dfs(grid,i,j);
            }
        }
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(grid[i][j]==1)
                    res++;
            }
        }
        return res;
        
        
    }
    
      public void dfs(int a[][], int i, int j) {
        if(i >= 0 && i <= a.length - 1 && j >= 0 && j <= a[i].length - 1 && a[i][j] == 1) {
            a[i][j] = 0;
            dfs(a, i + 1, j);
            dfs(a, i - 1, j);
            dfs(a, i, j + 1);
            dfs(a, i, j - 1);
        }
}
}

