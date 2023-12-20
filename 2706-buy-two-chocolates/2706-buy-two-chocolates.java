class Solution {
    public int buyChoco(int[] prices, int money) {
        int first=99999,second=99999;
        for(int i=0;i<prices.length;i++){
            if(prices[i]<first){
                second=first;
                first=prices[i];
            }
            else if(prices[i]<second){
                second=prices[i];
            }
        }
        int res=money-(first+second);
        return res>=0?res:money;
    }
}
   