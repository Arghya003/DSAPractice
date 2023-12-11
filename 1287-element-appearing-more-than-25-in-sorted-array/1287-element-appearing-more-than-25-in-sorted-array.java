class Solution {
    public int findSpecialInteger(int[] arr) {
        Map<Integer,Integer>map=new HashMap();
        for(int i=0;i<arr.length;i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        int count=arr.length/4;
        for(int i=0;i<arr.length;i++){
            if(map.get(arr[i])>count)
                return arr[i];
        }
        return -1;
    }
}