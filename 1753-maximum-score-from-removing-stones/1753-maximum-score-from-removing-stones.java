class Solution {
    public int maximumScore(int a, int b, int c) {
       PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
        int ans=0;
        pq.add(a);
        pq.add(b);
        pq.add(c);
        
        while(pq.size()>1)
        {
            
                int left=pq.poll();
                int right=pq.poll();
                
                left--;
                right--;
            
                if(left!=0)
                pq.add(left);
                if(right!=0)
                pq.add(right);
                ans++;
        }
        return ans;
    }
}

