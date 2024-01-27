class Solution {
    public int findCircleNum(int[][] isConnected) {
        int n=isConnected.length;
        int N=0;
        boolean []vis=new boolean[n];
        
        for(int i=0;i<n;i++){
            if(!vis[i]){
                N++;
                dfs(i,vis,isConnected);
            }
        }
        return N;
        
    }
    void dfs(int n,boolean vis[],int adj[][]){
        vis[n]=true;
        for(int i=0;i<adj.length;i++){
            if(adj[n][i]==1 &&!vis[i]){
                dfs(i,vis,adj);
            }
        }
    }
}