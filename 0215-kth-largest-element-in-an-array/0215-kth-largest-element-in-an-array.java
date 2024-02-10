class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer>pq=new PriorityQueue<>((a,b)->b-a);
        for(int i=0;i<nums.length;i++)
            pq.add(nums[i]);
        
        int l=k-1;
        while(l>0){
            pq.remove();
            l--;
        }
        return pq.peek();
    }
}