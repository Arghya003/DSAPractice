class Solution {
    public int subarraysWithKDistinct(int[] nums, int k) {
        return AtMost(nums,k)-AtMost(nums,k-1);
    }
    int AtMost(int[]nums,int k){
        int l=0,ans=0;
        Map<Integer,Integer>map=new HashMap<>();
        
        for(int r=0;r<nums.length;r++){
            if(map.getOrDefault(nums[r],0)==0)
                k--;
            
            map.put(nums[r],map.getOrDefault(nums[r],0)+1);
            
            while(k<0){
                map.put(nums[l],map.get(nums[l])-1);
                
                if(map.get(nums[l])==0)
                k++;
                
                l++;
            }
            ans+=r-l+1;
        }
        return ans;
    }
}
