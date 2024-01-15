class Solution {
    public int[] sortArrayByParity(int[] nums) {
        List<Integer>ans=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2==0)
                ans.add(nums[i]);
            
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2!=0)
                ans.add(nums[i]);
            
        }
        int[] ans1=new int[ans.size()];
        for(int i=0;i<ans.size();i++){
            ans1[i]=ans.get(i);
        }
        return ans1;
        
    }
}