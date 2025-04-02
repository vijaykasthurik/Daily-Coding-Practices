class Solution {
    public int maxProfit(int[] prices) {
        int profit=0;
        int st=prices[0];
        for(int i=1;i<prices.length;i++){
            if(prices[i]<st){
                st=prices[i];
            }else if(prices[i]-st>profit){
                profit=prices[i]-st;
            }
        }
        return profit;
    }
}
