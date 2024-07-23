class Solution {
    public int[] finalPrices(int[] prices) {
        for(int i=0 ; i<prices.length-1 ; i++){
            boolean discount = false ;
            for(int j=i+1 ; j<prices.length ; j++){
                if(discount == false && prices[j] <= prices[i]){
                    prices[i] -= prices[j];
                    discount = true ;
                }
            }
        }
        return prices ;
    }
}