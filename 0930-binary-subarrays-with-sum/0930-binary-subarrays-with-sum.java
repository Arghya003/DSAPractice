class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        int n = nums.length;
        int ans = 0;
        int[] count = new int[n+1];
        int sum = 0;
        count[0] = 1;
        for(int i=0;i<n;i++){
            sum+= nums[i]%2;
            if(sum-goal>=0)
                ans += count[sum-goal];
            count[sum]++;
        }
        return ans;
    }
}