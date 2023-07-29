class Solution {
    public boolean search(int[] nums, int target) {
        int n=nums.length;
        int s=0,e=n-1;

        while(s<=e){
            int mid= s+(e-s)/2;

            if(nums[mid]==target)
            return true;
            else if(nums[s]==nums[mid]&& nums[mid]==nums[e]){
                s++;
                e--;
                continue;
            }

            else if(nums[s]<=nums[mid]){
                if(nums[s]<=target && nums[mid]>target)
                e=mid-1;
                else
                s=mid+1;
            }
            else
            {
                if(nums[mid]<target &&target<=nums[e])
                s=mid+1;
                else
                e=mid-1;
            }
        }
        return false;
    }
}