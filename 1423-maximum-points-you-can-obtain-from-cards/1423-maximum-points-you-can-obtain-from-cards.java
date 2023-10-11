class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int res=0;
        
        for(int i=0;i<k;i++)
            res+=cardPoints[i];
        
        
        int curr=res;
        for(int i=k-1;i>=0;i--){
            curr-=cardPoints[i];
            curr+=cardPoints[cardPoints.length-k+i];
            
            res=Math.max(res,curr);
        }
        return res;
    }
}

