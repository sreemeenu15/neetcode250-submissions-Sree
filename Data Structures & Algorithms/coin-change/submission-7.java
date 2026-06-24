class Solution {
    public int coinChange(int[] coins, int amount) {
          
          int[] cache = new int[amount +1];
          Arrays.fill(cache,-2);
          int minCoins = helper(coins, amount, cache);
          return minCoins;

    }

    public int helper(int[] coins, int amount, int[] cache){

        if(amount == 0) return 0;
    
        if(cache[amount] != -2) return cache[amount];
        int res = Integer.MAX_VALUE;
        for(int i =0; i < coins.length; i++){

            if(coins[i]<= amount){

               int sub = helper(coins, amount-coins[i], cache);
               if(sub != -1){

                res = Math.min(res, 1 + sub);
                
               }
              
            }
            
        }
        cache[amount] = (res == Integer.MAX_VALUE )? -1 : res;
        return cache[amount];     
    }

}

/*
1. How do I handle cases when target cannot be made up with coins available.
2. how do I handle scenario where different kind of coins could be used
and I have to return min num of coins 
*/