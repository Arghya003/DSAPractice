class Solution {
    public int maxProductDifference(int[] nums) {
        int a=0,b=0,c=99999,d=99999;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>a){
                b=a;
                a=nums[i];
            }
            else
                b=Math.max(b,nums[i]);
        
        if(nums[i]<c){
            d=c;
            c=nums[i];
            
        }
        else
            d=Math.min(d,nums[i]);
        
    }
    
    return a*b-c*d;
}
}