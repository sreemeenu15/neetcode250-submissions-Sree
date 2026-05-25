class Solution {
    public int maxProfit(int[] prices) {

        int minSoFar = prices[0];
        int maxProfitSoFar = 0;
        int currentProfit = 0;


        for(int i = 0; i < prices.length; i++){

            if(prices[i] < minSoFar){

               minSoFar = prices[i]; 
                
            }
             currentProfit = prices[i]- minSoFar;
                 
            
            maxProfitSoFar = Math.max(currentProfit,  maxProfitSoFar);
        
        }
        
        return maxProfitSoFar;
        
    }
}
