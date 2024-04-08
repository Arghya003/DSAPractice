class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        int cc=0,sc=0;
        
        for(int s:students){
            if(s==0)
                cc++;
            else
                sc++;
        }
        
        for(int sw:sandwiches){
            if(sw==0 && cc==0)
                return sc;
            if(sw==1 && sc==0)
                return cc;
            
            if(sw==0){
                cc--;
            }
            else
                sc--;
        }
        return 0;
    }
}