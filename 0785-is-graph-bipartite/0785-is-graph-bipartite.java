class Solution {
    public boolean isBipartite(int[][] graph) {
         int N = graph.length;
        int[] colors = new int[N]; // 0 not colored, 1 = Red, -1 = Blue
        for(int vertex = 0; vertex < N; vertex++) { // handle forest
            if(colors[vertex] == 0) {
                colors[vertex] = 1;
                Queue<Integer> queue = new LinkedList();
                queue.add(vertex);
                
                while(!queue.isEmpty()) {
                    int currVert = queue.poll();
                    for(int adjVert : graph[currVert]) {
                        if(colors[adjVert] == colors[currVert])
                            return false;
                        if(colors[adjVert] == 0) {
                            colors[adjVert] = -colors[currVert];
                            queue.add(adjVert);
                        }
                    }
                }
            }
        }
        
        return true;
}
}

 

  