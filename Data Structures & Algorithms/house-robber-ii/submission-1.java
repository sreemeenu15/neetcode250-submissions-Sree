class Solution {
    public int rob(int[] nums) {

        int[] cache = new int[nums.length];
        int[] cache1 = new int[nums.length];

        Arrays.fill(cache, -1);
        Arrays.fill(cache1, -1);

        if(nums.length == 1) return nums[0];

        int maxMoney = Math.max(helper(0, nums.length-2, nums,cache), helper(1, nums.length-1, nums, cache1));
        return maxMoney;

    }

    public int helper(int i, int end, int[] nums, int[] cache ){
         
      
         if( i > end) return 0;
        
        if(cache[i] == -1){
         cache[i] = Math.max(nums[i] + helper(i+2,end,nums, cache), helper(i+1, end, nums, cache));

        }
      return cache[i];
    }
}
