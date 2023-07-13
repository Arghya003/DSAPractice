class Solution {
  public static List < List < String >> partition(String s) {
        List < List < String >> res = new ArrayList < > ();
        List < String > path = new ArrayList < > ();
        partitionHelper(0, s, path, res);
        return res;
    }

    static void partitionHelper(int index, String s, List < String > path, List < List < String >> res) {
        if (index == s.length()) {
            res.add(new ArrayList < > (path));
            return;
        }
        for (int i = index; i < s.length(); ++i) {
            if (isPalindrome(s, index, i)) {
                path.add(s.substring(index, i + 1));
                partitionHelper(i + 1, s, path, res);
                path.remove(path.size() - 1);
            }
        }
    }
   static boolean isPalindrome(String str, int s,int e){
        while(s<=e){
            if(str.charAt(s++)!=str.charAt(e--)){
                return false;
            }
            }
            return true;
        
}
}