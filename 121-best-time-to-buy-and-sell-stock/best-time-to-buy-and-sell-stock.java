class Solution {
    public int maxProfit(int[] prices) {

        int minPrice = Integer.MAX_VALUE ;
        int maxProfit = 0;
        int curProfit = 0;

        for(int i=0 ; i<prices.length-1 ; i++){
            if(prices[i] < minPrice){
                minPrice = prices[i];
            }
            curProfit = prices[i+1] - minPrice;
            if(curProfit > maxProfit){
                maxProfit = curProfit ;
            }
        }

        return maxProfit ;
        
    }
}