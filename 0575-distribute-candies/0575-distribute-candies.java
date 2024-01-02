class Solution {
    public int distributeCandies(int[] candyType) {
        Map<Integer,Integer>map=new HashMap<>();
        int n=candyType.length;
        int limit=n/2;
        for( int nums:candyType){
            if(map.containsKey(nums)){
                map.put(nums,map.get(nums)+1);
                
            }
            else{
                map.put(nums,1);
            }
        }
        if(map.size()<=limit){
            return map.size();
        }
        else
             return limit;
    }
}