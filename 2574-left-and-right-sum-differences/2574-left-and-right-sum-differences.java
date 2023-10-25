class Solution {
    public int[] leftRightDifference(int[] nums) {
        int ans[]=new int [nums.length];
        int rsum=0,lsum=0;
        for(int i=0;i<nums.length;i++)
            rsum+=nums[i];
        for(int i=0;i<nums.length;i++){
            rsum-=nums[i];
            ans[i]=Math.abs(lsum-rsum);
            lsum+=nums[i];
        }
        return ans;
        
        
    }
}