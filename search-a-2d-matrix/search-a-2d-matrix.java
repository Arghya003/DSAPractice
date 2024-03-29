class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int n= matrix.length;
        int m= matrix[0].length;
        int l=0;
        int h=(n*m)-1;
        while(l<=h){
            int mid=(l+(h-l)/2);
            if(matrix[mid/m][mid%m]==target)
            return true;
            else if(matrix[mid/m][mid%m]<target)
            l++;
            else
            h--;
        }
        return false;
    }
}