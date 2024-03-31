class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        
        if(nums==null|| nums.length==0)
            return 0;
        
        int ans=0;
        HashMap<Integer,Integer>map=new HashMap<>();
        map.put(0,1);
        int sum=0;
        int rem=0;
        for(int n:nums){
            sum+=n;
            rem=sum%k;
            if(rem<0)
                rem+=k;
            
            if(map.containsKey(rem))
                ans+=map.get(rem);
               
           map.put(rem,map.getOrDefault(rem,0)+1);
        }
    
        

        return ans;
        
        
    }
}  