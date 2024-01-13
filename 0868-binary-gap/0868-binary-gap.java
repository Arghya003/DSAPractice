class Solution {
    public int binaryGap(int n) {
        int []ind=new int[32];
        int j=0;
        for(int i=0;i<32;i++){
            if (((n>> i) & 1) != 0)
                ind[j++]=i;
            
        }
        int ans=0;
        for(int i=0;i<j;i++){
            ans=Math.max(ans,ind[i+1]-ind[i]);
        }
        return ans;
        
    }
}