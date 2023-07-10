class Solution {
    public void findcomb(int ind,int arr[] ,int tar,List<List<Integer>> res,List<Integer> ds)  
    {
        if(tar==0){
                res.add(new ArrayList<>(ds));
                return;
        }
        for(int i=ind;i<arr.length;i++){
            if(i>ind && arr[i]==arr[i-1])
            continue;

            if(arr[i]>tar)
            break;

            ds.add(arr[i]);
            findcomb(i+1,arr,tar-arr[i],res,ds);
            ds.remove(ds.size()-1);
        }

   
    }
    public List<List<Integer>> combinationSum2(int[] arr, int tar) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> ds= new ArrayList<>();
        Arrays.sort(arr);
        findcomb(0,arr,tar,res,ds);
        return res;
    }
}