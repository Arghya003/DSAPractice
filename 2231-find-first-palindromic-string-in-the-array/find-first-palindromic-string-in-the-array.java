class Solution {
    public String firstPalindrome(String[] words) {
        for(int i=0;i<words.length;i++){
            String s=words[i];
            if(isPalin(s)==true)
                return s;
        }
        return "";
    }
    boolean isPalin(String str){
        int s=0,e=str.length()-1;
        while(s<=e){
            if(str.charAt(s)!=str.charAt(e))
                return false;
            s++;
            e--;
        }
        return true;
    }
}