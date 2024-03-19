class Solution {
    public int leastInterval(char[] tasks, int n) {
       int[] freq = new int[26];
        for(char ch: tasks){
            freq[ch-'A']++;
        }
        Arrays.sort(freq);
        int max = freq[25];
        int maxCount = 0; 
        for(int i = 0; i<26; i++){
            if(freq[i] == max){
                maxCount++;  
            }
        }

        return Math.max(((max-1) * (n+1) + maxCount), tasks.length);
    }
}