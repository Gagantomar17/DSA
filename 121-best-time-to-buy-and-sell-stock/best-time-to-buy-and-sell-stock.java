class Solution {
    public int maxProfit(int[] prices) {
        int min_price = prices[0];
        int maxprof = 0;

        for(int i=1;i<prices.length;i++){
            maxprof = Math.max(maxprof,prices[i]-min_price);
            min_price = Math.min(prices[i],min_price);
        }

        return maxprof;
        // int minBuy = prices[0] ;
        // int maxSell = Integer.MIN_VALUE ;
        // int l = 0, idx=0;
        // int r = prices.length-1 ;
        // if(prices.length<=1){
        //     return 0;
        // }
        // while(idx < r){
        //     if(prices[l] < minBuy){
        //         minBuy = prices[l] ;
        //         idx = l ;
        //     }
        //     if(prices[r] > maxSell){
        //         maxSell = prices[r];
        //     }
        //     l++ ;
        //     r--;
        // }
        // int profit = maxSell - minBuy ;
        // if(profit <=0){
        //     return 0;
        // }
        // return maxSell - minBuy ;

        // int minPrice = Integer.MAX_VALUE ;
        // int maxProfit = 0;
        // int curProfit = 0;

        // for(int i=0 ; i<prices.length-1 ; i++){
        //     if(prices[i] < minPrice){
        //         minPrice = prices[i];
        //     }
        //     curProfit = prices[i+1] - minPrice;
        //     if(curProfit > maxProfit){
        //         maxProfit = curProfit ;
        //     }
        // }

        // return maxProfit ;
        
    }
}