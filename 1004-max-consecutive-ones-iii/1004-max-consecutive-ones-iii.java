class Solution {
    public int longestOnes(int[] nums, int k) {
        
        int left=0,n=nums.length, ans=0,z=0;
        for(int right=0;right<n;right++){
            if(nums[right]==0)
                z++;
            
            if(z>k){
                if(nums[left]==0)
                    z--;
                
                left++;
            }
            ans=Math.max(ans,right-left+1);
        }        
        return ans;
    }
}
