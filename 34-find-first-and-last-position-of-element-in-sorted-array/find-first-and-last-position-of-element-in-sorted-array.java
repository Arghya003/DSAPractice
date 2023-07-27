class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[]ar=new int[2];
       ar[0]=first(nums,nums.length,target);
       ar[1]=last(nums,nums.length,target);

        return ar;
    }

public static int first(int[] nums,int n,int target){
     
        int s=0,e=n-1,f=-1;
        while(s<=e){
            int mid= s+(e-s)/2;

            if(nums[mid]==target){
                f=mid;
                e=mid-1;
            }
            else if(nums[mid]<target)
            s=mid+1;
            else
            e=mid-1;

        }
        return f;
}

public static int last(int[]nums,int n,int target){
     int s=0,e=n-1,l=-1;
        while(s<=e){
            int mid= s+(e-s)/2;

            if(nums[mid]==target){
                l=mid;
                s=mid+1;
            }
            else if(nums[mid]<target)
            s=mid+1;
            else
            e=mid-1;

        }
        return l;
    }
}