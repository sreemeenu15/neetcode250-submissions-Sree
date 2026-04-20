class Solution {
    public int minCostClimbingStairs(int[] cost) {

        int n = cost.length;
        int[] memo = new int[n];

        memo[0] = cost[0];
        memo[1] = cost[1];
        
        for(int i = 2; i<n; i++ ){
           
            memo[i] =  cost[i] + Math.min(memo[i-1], memo[i-2]);

        }
        return Math.min(memo[n-1], memo[n-2]);

    }
}
