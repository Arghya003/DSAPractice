class Solution {
    public String getHint(String secret, String guess) {
      int bulls=0,cows=0;
      
        Map<Character,Integer>sf=new HashMap<>();
        Map<Character,Integer>gf=new HashMap<>();
        
        for(int i=0;i<secret.length();i++){
            char s=secret.charAt(i);
            char g=guess.charAt(i);
            if(s==g) bulls++;
            else{
                sf.put(s,sf.getOrDefault(s,0)+1);
                gf.put(g,gf.getOrDefault(g,0)+1);
                
            }
        }
        for( char c :sf.keySet()){
            if(gf.containsKey(c)){
                cows+=Math.min(sf.get(c),gf.get(c));
            }
        }
        return bulls+"A"+cows+"B";
    }
}

 