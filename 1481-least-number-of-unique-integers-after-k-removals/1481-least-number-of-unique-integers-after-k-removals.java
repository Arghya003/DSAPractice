class Solution {
    public int findLeastNumOfUniqueInts(int[] arr, int k) {
        Map<Integer,Integer>map=new HashMap<>();
        for(int n:arr){
            map.put(n,map.getOrDefault(n,0)+1);
        }
        PriorityQueue<Integer>pq=new PriorityQueue<>(map.values());
        int numE=0;
        while(!pq.isEmpty()){
            numE+=pq.peek();
            if(numE>k)
                return pq.size();
            
             pq.poll();
        }
       return 0;
    }
}