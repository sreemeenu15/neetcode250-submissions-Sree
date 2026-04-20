class Solution {
  
    public int climbStairs(int n) {

    int[] memo = new int[n+1];  
    return helper(n, memo);
    }

    private int helper(int n, int[] memo){

        if(memo[n] != 0) return memo[n];

        if(n == 0 || n == 1) return memo[n] = 1;

        memo[n] = helper(n-1, memo) + helper(n-2, memo);

        return memo[n];

    }
}
