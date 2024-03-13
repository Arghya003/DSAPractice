class Solution {
   public int rob(int[] nums) {
    if(nums==null||nums.length==0) return 0;        
    int exclude_1st = rob_helper(nums, 1, nums.length-1);
    int include_1st = nums[0] + rob_helper(nums, 2, nums.length-2);
    return Math.max(include_1st, exclude_1st);        
}

public int rob_helper(int[] nums, int start, int end) {     
    int prev2 = 0;
    int prev = 0;
    for(int i=start; i<=end; i++)
    {
        int cur = Math.max(nums[i] + prev2, prev);
        int temp = prev;
        prev = cur;
        prev2 = temp;
    }        
    return prev;
}
}