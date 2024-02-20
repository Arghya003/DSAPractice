class Solution {
    public int missingNumber(int[] nums) {
        
        int n= nums.length;
        int res=n;
        for(int i=0;i<n;i++){
            res^=i;
            res^=nums[i];  //a^b^b=a here a=i,b=nums[i]
        }
        return res;
    }
}