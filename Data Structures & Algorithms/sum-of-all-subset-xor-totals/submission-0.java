class Solution {
    public int subsetXORSum(int[] nums) {
        
        int result = backTrack11(nums, 0, 0);
        return result;
       
    }

    public int backTrack11(int[] nums, int start, int xor){
        
        if(nums.length == 0) return 0;
        if(start == nums.length) return xor;
         
         
        return backTrack11(nums, start+1, xor ^ nums[start]) + backTrack11(nums, start +1, xor);
     
        }
    }


/*
1. I meant to create subset
2. Do XOR of elements of each subset
3. then we need to add them 

*/