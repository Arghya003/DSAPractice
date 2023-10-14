class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        List<String>ans=new ArrayList<>();
        if(s.length()<=10)
            return ans;
        
        Map<String,Integer>map=new HashMap<>();
        int i=0,j=10;
        while(j<=s.length()){
            String str=s.substring(i++,j++);
            map.put(str,map.getOrDefault(str,0)+1);
            if(map.get(str)>1 && !ans.contains(str)){
                ans.add(str);
            }
        }
        return ans;
       
        
    }
   
        
}
 


