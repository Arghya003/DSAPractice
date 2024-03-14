class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
      return AtMost(nums,goal)-AtMost(nums,goal-1);
    }
    int AtMost(int[]nums, int goal){
       
        
        int r=0,l=0,ans=0,sum=0;
        for(r=0;r<nums.length;r++){
            sum+=nums[r];
            while(sum>goal && l<=r){
                sum-=nums[l];
                l++;
            }
            ans+=r-l+1;
        }
        return ans;
    }
}