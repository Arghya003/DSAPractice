class Solution {
    public int majorityElement(int[] nums) {
     HashMap <Integer,Integer> map = new HashMap<>();

        for(int i=0;i<nums.length;i++){

            int v= map.getOrDefault(nums[i],0);
            map.put(nums[i],v+1);
        }

        for( Map.Entry<Integer,Integer> it: map.entrySet()){
        if(it.getValue()>(nums.length/2))
        return it.getKey();
        }
        return -1;
    }
}