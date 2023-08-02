class Solution {
    
    private int Sum(int[] nums, int divisor) {
        int result = 0;
        for (int i=0;i<=nums.length-1;i++) {
            result += Math.ceil((1.0 * nums[i]) / divisor);
        }
        return result;
    }
    
    public int smallestDivisor(int[] nums, int threshold) {
        int ans = -1;
        
        int low = 1;
        int high = nums[0];
        for (int num : nums) {
            high = Math.max(high, num);
        }
        
        
        while (low <= high) {
            int mid = (low + high) / 2;
            int result = Sum(nums, mid);
            
            if (result <= threshold) {
                ans = mid;
                high = mid - 1;
            }
           
            else {
                low = mid + 1;
            }
        }
        
        return ans;
    }
}