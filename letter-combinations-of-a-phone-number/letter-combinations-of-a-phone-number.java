class Solution {
    public List<String> letterCombinations(String digits) {
        if (digits.length() == 0) return new ArrayList<>();
        
        String[] map = new String[] {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };
        List<String> ans = new ArrayList<>();
        int index=0;
        String output="";
        backtrack(digits,output,index,ans,map);
        return ans;
    }
    
    public void backtrack(String digits,String output,int ind, List<String>ans,String []map) {
       if(ind==digits.length()){
           ans.add(output);
           return;
       }
       int number=digits.charAt(ind)-'0';
       String value=map[number];
       for(int i=0;i<value.length();i++){
           output+=value.charAt(i);
           backtrack(digits,output,ind+1,ans,map);
           output=output.substring(0,output.length()-1);
       }
    }
}