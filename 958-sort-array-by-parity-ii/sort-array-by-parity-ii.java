class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        int ans[]=new int[nums.length];
        int s=0,e=1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2==0){
                ans[s]=nums[i];
                s=s+2;
            }
            else
            {
                ans[e]=nums[i];
                e=e+2;
            }
        }
        return ans;
    }
}