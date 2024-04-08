class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int m=matrix.length;
        int n=matrix[0].length;
        int t=0,b=m-1,r=n-1,l=0;
        
        List<Integer>ls=new ArrayList<>();
        int i=1;
        
        while(t<=b &&  l<=r){
            for(i=l;i<=r;i++)
                ls.add(matrix[t][i]);
            
            t++;
            
            for(i=t;i<=b;i++)
                ls.add(matrix[i][r]);
            r--;
            
            if(t<=b){
                for(i=r;i>=l;i--)
                    ls.add(matrix[b][i]);
                b--;
                
            }
            
            if(l<=r){
                for(i=b;i>=t;i--)
                    ls.add(matrix[i][l]);
                
                l++;
            }
        }
        return ls;
       
    }
}

