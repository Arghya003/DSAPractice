class Solution {
    public int[] answerQueries(int[] nums, int[] queries) {
        int n=nums.length;
        int m=queries.length;
        int ans[]=new int[m];
        
        Arrays.sort(nums);
        
        for(int i=1;i<nums.length;i++){
            nums[i]+=nums[i-1];
        }
        
        for(int i=0;i<m;i++){
            int k=queries[i];
            
            int s=0,e=n-1;
            while(s<=e){
                int mid=s+(e-s)/2;
                
                if(nums[mid]==k){
                    ans[i]=mid+1;
                    break;
                    
                }
                else if(nums[mid]< k){
                    ans[i]=mid+1;
                    s=mid+1;
                }
                else{
                    e=mid-1;
                }
            }
        }
        return ans;
        
    }
}

 