class Solution {
    public int strStr(String haystack, String needle) {
        
        String ans="";
        for(int i=0;i<haystack.length();i++){
            for(int j=i;j<haystack.length();j++){
                ans=haystack.substring(i,j+1);
                if(ans.equals(needle))
                    return i;
            }
        }
        return -1;
    }
}