class Solution {
    public void duplicateZeros(int[] arr) {
        ArrayList<Integer>ls=new ArrayList<>();
        
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){
                ls.add(0);
                ls.add(0);
            }
            else
            ls.add(arr[i]);
        }
        for(int i = 0 ; i < arr.length ;i++){
            arr[i] = ls.get(i);
        }
       
        
    }
}
 