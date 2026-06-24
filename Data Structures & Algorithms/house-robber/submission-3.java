class Solution {
    public int rob(int[] nums) {
        
        int[] cache = new int[nums.length];
        Arrays.fill(cache, -1);
        int maxMoney = helper(0, nums, cache);
        return maxMoney;

    }

    public int helper(int i, int[] nums, int[] cache ){
         
        
         if( i >= nums.length) return 0;
        
        if(cache[i] == -1){
         cache[i] = Math.max( nums[i] + helper(i+2, nums, cache), helper(i+1, nums, cache));

        }
      return cache[i];
    }
}
