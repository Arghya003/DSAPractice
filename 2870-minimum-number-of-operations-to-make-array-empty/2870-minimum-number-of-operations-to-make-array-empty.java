class Solution {
    public int minOperations(int[] nums) {
        HashMap<Integer,Integer>map=new HashMap<>();
        int ans=0;
        
        for(int i=0;i<nums.length;i++){
           map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        for( int c: map.keySet()){
            int f=map.get(c);
            if(f==1)
                return -1;
            
            ans+=Math.ceil((double)f/3);
        }
        return ans;
    }
}

      