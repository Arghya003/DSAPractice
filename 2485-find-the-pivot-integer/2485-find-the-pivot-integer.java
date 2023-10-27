class Solution {
    public int pivotInteger(int n) {
        int sum = n*(n+1)/2;
        int lsum=0;
        for(int i=1;i<=n;i++){
             lsum+=i;
            int rsum=sum-lsum+i;
            
            if(lsum==rsum)
                return i;
        }
        return -1;
        
    }
}

