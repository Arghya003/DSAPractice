class Solution {
    public int findDuplicate(int[] nums) {
      int i=0;
      while(i<nums.length){
          int correct=nums[i];
          
          if(nums[correct]!=nums[i]){
              int temp=nums[i];
              nums[i]=nums[correct];
              nums[correct]=temp;
          }
          else
              return nums[i];
      }
        return -1;
      }
        
}