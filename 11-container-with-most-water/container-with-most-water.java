class Solution {
    public int maxArea(int[] height) {
        int res=0;
        int l=0,r=height.length-1;
        
        while(l<r){
            int area=Math.min(height[l],height[r])*(r-l);
            
             res=Math.max(res,area);
            
            if(height[l]<height[r])
                l++;
            else
                r--;
        }
        
        
        
        return res;
    }
}