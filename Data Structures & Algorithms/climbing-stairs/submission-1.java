class Solution {
    public int climbStairs(int n) {

        int current = 0;
        int prev1 = 1, prev2 = 2;

        if(n == 1) return 1;
        if(n == 2) return 2;

        for(int i =3; i <= n ; i++){
             
            current = prev1 + prev2;
            prev1 = prev2;
            prev2 = current;
       
        }
        
        return current;
    }
}
