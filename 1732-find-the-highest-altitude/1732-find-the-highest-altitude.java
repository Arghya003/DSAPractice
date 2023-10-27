class Solution {
    public int largestAltitude(int[] gain) {
        int ans=0;
        int curr=0;
        
        for(int i=0;i<gain.length;i++){
            curr+=gain[i];
            ans=Math.max(curr,ans);
        }
        return ans;
    }
}