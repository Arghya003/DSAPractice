class Solution {
    public int maxFrequencyElements(int[] nums) {
         Map<Integer,Integer>ans=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(ans.containsKey(nums[i]))
                ans.put(nums[i],ans.get(nums[i])+1);
            else
                ans.put(nums[i],1);
        }
        int freq=0;
        for(int f: ans.values()){
            freq=Math.max(freq,f);
        }
        int res=0;
        for(int f:ans.values()){
            if(freq==f)
                res+=f;
        }
        return res;
    }
}