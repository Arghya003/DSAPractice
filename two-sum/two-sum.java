class Solution {
    public int[] twoSum(int[] nums, int target) {
        int []ans=new int[2];
        ans[0]=ans[1]=-1;
        HashMap<Integer,Integer>map=new HashMap<>();
        int n= nums.length;
        for(int i=0;i<n;i++){
            int num=nums[i];
            int morenum=target-num;
            if(map.containsKey(morenum)){
                ans[0]=map.get(morenum);
                ans[1]=i;
                return ans;
            }
            map.put(nums[i],i);
        }
        return ans;
    }
}