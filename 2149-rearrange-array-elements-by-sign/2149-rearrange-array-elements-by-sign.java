class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n=nums.length;
        int [] ar= new int[n];
        int s=0,e=1;
        for(int i=0;i<n;i++){
            if(nums[i]>0){
                ar[s]=nums[i];
                s=s+2;
            }
            else if(nums[i]<0){
            ar[e]=nums[i];
            e=e+2;
            }
        }
        return ar;
    }
}