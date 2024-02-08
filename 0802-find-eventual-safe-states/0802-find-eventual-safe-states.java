class Solution {
    public List<Integer> eventualSafeNodes(int[][] graph) {
        List<Integer>ans=new ArrayList<>();
        int n=graph.length;
        List<List<Integer>>adj=new ArrayList<>();
         int[] indegree = new int[n];
        
        for(int i=0;i<n;i++)
            adj.add(new ArrayList<>());
        
         for (int i = 0; i < n; i++) {
            for (int node : graph[i]) {
                adj.get(node).add(i);
                indegree[i]++;
            }
        }
          Queue<Integer> q = new LinkedList<>();
       
           for (int i = 0; i < n; i++) {
            if (indegree[i] == 0) {
                q.add(i);
            }
        }
        
         boolean[] safe = new boolean[n];
            while (!q.isEmpty()) {
                int node = q.poll();
                safe[node] = true;

                for (int neighbor : adj.get(node)) {
                    // Delete the edge "node -> neighbor".
                    indegree[neighbor]--;
                    if (indegree[neighbor] == 0) {
                        q.add(neighbor);
                    }
                }
            }
      for (int i = 0; i < n; i++) {
            if (safe[i]) {
                ans.add(i);
            }
        }
        return ans;

        
    }
}