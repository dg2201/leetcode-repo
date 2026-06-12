class Solution {
    public int maxProfit(int[] prices) {
        int max=0;
        int sell=1;
        int buy=0;
        while(sell<prices.length) {
            if (prices[buy]<prices[sell]){
                 int profit = prices[sell]-prices[buy];
                if (profit > max){
                    max=profit;
                    
                }
                
               
                
            }
            else{
              buy=sell;
              //if we found that at some point the selling price is even lower than buying price that would mean that we found an all time low so we would wanna junmp there directly
              
                
            }
            sell++;


        }
        return max;

    }
}