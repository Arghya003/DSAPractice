class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        PriorityQueue<Integer>pq=new PriorityQueue<>();
        
        for(int num: arr){
            if(k>0){
                pq.add(num);
                k--;
            }
            else if(Math.abs(pq.peek()-x)>Math.abs(num-x)){
                pq.poll();
                pq.add(num);
            }
        }
       
        
         List<Integer> result = new ArrayList<>();
        while (!pq.isEmpty()) {
            result.add(pq.poll());
        }
        return result;
        
    }
}

  

