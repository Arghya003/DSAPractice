class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
       if (k ==0) return false;
        Set<Integer> slidingWindow = new HashSet();
        for(int i = 0; i<nums.length; i++){
            if(slidingWindow.contains(nums[i])) return true;
              
            if(i >= k)
                slidingWindow.remove(nums[i - k]);
            slidingWindow.add(nums[i]);
        }
        return false;
    }
}