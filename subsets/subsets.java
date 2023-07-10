class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        helper(result,new ArrayList<Integer>(),nums,0);
        
        return result;
        
    }
    public static void helper(List<List<Integer>>res, List<Integer>temp,int[]nums,int ind){
        if(nums.length==ind){
            res.add(new ArrayList<>(temp));
            return;
        }
        // include
        temp.add(nums[ind]);
        helper(res,temp,nums,ind+1);

        temp.remove(temp.size()-1);
        
        //exclude
        helper(res,temp,nums,ind+1);
    }
}

