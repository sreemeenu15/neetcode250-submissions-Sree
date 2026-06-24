class Solution {
    HashMap<Integer, Integer> memo = new HashMap<>();
    public int climbStairs(int n) {
        
        if(n == 0 || n == 1) return 1;
     
        if(!memo.containsKey(n)){

            memo.put(n, climbStairs(n-1) + climbStairs(n-2));
        }

        return memo.get(n);
        
    }
}

/*
1. ways to climb to top of staircase
2. steos that are changing as we climb them up
3. n =0 when no steps are left further
4. to either take 1 or 2 step
5. sum as I can climb either by taking 1 or 2 steps
*/