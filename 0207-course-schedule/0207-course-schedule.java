class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
         if (numCourses == 0 || prerequisites.length == 0) return true;
        
        int indeg[]=new int [numCourses];
        for (int i = 0; i < prerequisites.length; i++)
        indeg[prerequisites[i][0]]++;    
        
        
        Queue<Integer> queue = new LinkedList<Integer>();
        
        for(int i=0;i<numCourses;i++){
            if(indeg[i]==0)
                queue.add(i);
        }
        int canFinishCount = queue.size();  
        
        while (!queue.isEmpty()) {
            int prerequisite = queue.remove();
            for (int i = 0; i < prerequisites.length; i++)  {
                if (prerequisites[i][1] == prerequisite) { 
                    indeg[prerequisites[i][0]]--;
                    if (indeg[prerequisites[i][0]] == 0) {
                        canFinishCount++;
                        queue.add(prerequisites[i][0]);
                    }
                }
            }
        }

    return (canFinishCount == numCourses);
    }
}

 