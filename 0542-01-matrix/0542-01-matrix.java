class Solution {
    public int[][] updateMatrix(int[][] mat) {
        int r=mat.length;
        int c=mat[0].length;
        boolean vis[][]=new boolean[r][c];
        Queue<int[]>q=new LinkedList<>();
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(mat[i][j]==0){
                    vis[i][j]=true;
                    q.offer(new int[]{i,j});
                }
            }
        }
        int[][] dir=new int[][]{{-1,0},{0,1},{1,0},{0,-1}};
            while(!q.isEmpty()){
                int[] node=q.poll();
                for(int i=0;i<4;i++){
                    int nr=node[0]+dir[i][0];
                    int nc=node[1]+dir[i][1];
                    if(nr<0||nr>=r||nc<0||nc>=c||vis[nr][nc])
                        continue;
                    vis[nr][nc]=true;
                    mat[nr][nc]=mat[node[0]][node[1]]+1;
                    q.offer(new int[]{nr,nc});
                    
                }
            }
        return mat;
    }
}

 