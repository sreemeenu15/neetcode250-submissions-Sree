class Solution {
    public int[] twoSum(int[] nums, int target) {

    HashMap<Integer, Integer> map = new HashMap<>();
    int[] result = new int[2];
    int index = -1;

      for(int i =0; i < nums.length; i++){
          
          
          if(map.containsKey(target - nums[i])){
             index = map.get(target-nums[i]);
            result[0] = index;
            result[1]= i ;
          }

          if(!map.containsKey(nums[i])){

            map.put(nums[i], i);
           
          }
   
      }
        return result;
        
    }
}
