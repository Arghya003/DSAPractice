class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        int ans=0,r=0,l=0,odd=0,cnt=0;
        
        for(r=0;r<nums.length;r++){
            if(nums[r]%2!=0)
            {
                odd++;
                cnt=0;
            }
            while(odd==k)
            {
               
                if(nums[l]%2!=0){
                    odd--;
                   
                }
                l++;
                
                 
                cnt++;
            }
            ans+=cnt;
        }
        return ans;
    }
}
