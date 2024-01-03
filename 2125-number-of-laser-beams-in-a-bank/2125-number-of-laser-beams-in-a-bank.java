class Solution {
    public int numberOfBeams(String[] bank) {
        int prev=0;
        int total=0;
        for(String row: bank){
            int curr=calc(row);
            if(curr==0)
                continue;
            
            total+=curr*prev;
            prev=curr;
        }
        return total;
        
    }
    int calc(String s){
        int c=0;
        for(char ch:s.toCharArray()){
            c+=ch-'0';
        }
        return c;
    }
}


