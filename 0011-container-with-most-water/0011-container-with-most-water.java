class Solution {
    public int maxArea(int[] height) {
       int res=0;
       int l=0,r=height.length-1;
       while(l<r){
           int area=(r-l)*Math.min(height[l],height[r]);
           res=Math.max(area,res);

           if(height[r]>height[l])
           l++;
           else if(height[r]<height[l])
           r--;
           else
           l++;
       }

      
        return res;
        
    }
}