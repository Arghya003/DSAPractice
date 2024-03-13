class Solution {
      public int helper(int []nums,int ind,int []dp){
        if(ind>=nums.length)return 0;
        if(dp[ind]!=-1)return dp[ind];
        int not=helper(nums,ind+1,dp);
        int take=nums[ind]+helper(nums,ind+2,dp);
        return dp[ind]=Math.max(not,take);
    }
    public int rob(int[] nums) {
        int n=nums.length;
        int []dp=new int[n];
        Arrays.fill(dp,-1);
        return helper(nums,0,dp);
    }
}