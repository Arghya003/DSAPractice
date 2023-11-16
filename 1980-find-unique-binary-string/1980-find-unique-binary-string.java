class Solution {
    public String findDifferentBinaryString(String[] nums) {
        String ans="";
        for(int i=0;i<nums.length;i++){
            char curr= nums[i].charAt(i);
            ans+=curr=='0'?'1':'0';
        }
            
        return ans;
    }
}