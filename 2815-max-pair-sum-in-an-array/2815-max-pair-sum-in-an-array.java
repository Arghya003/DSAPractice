class Solution {
    public int maxSum(int[] nums) {
         int ans = -1;
    for(int i=0; i<nums.length; i++){
        for(int j=i+1; j<nums.length; j++){ // will make pairs with the proceeding ones,
            // because a[0] pairs with a[1] will be same as a[1] pairs with a[0]
            if(getMaxDigit(nums[i]) == getMaxDigit(nums[j])){
                ans = Math.max(nums[i] + nums[j], ans);
            }
        }
    }
    return ans;
}

public int getMaxDigit(int n){
    int max= Integer.MIN_VALUE;
    while(n>0){
        max = Math.max(max, n%10);
        n /=10;
    }
    return max;
    }
}