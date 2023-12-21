class Solution {
    public int differenceOfSum(int[] nums) {
        int s1=0,s2=0;
        for(int i=0;i<nums.length;i++){
            s1+=nums[i];
            s2+=digitsum(nums[i]);
        }
        return Math.abs(s1-s2);
    }
    int digitsum(int n){
        int r=0,s=0;
        while(n>0){

            r=n%10;
            n=n/10;
            s+=r;
                  
        }
        return s;
    }
}