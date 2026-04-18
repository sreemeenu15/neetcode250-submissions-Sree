class Solution {
    public int majorityElement(int[] nums) {
        
      HashMap<Integer, Integer> hs = new HashMap<>();
      for(int i =0; i < nums.length; i++){

          hs.put(nums[i], hs.getOrDefault(nums[i], 0) + 1);
        
      }
      for(var pair : hs.entrySet()){

          if(pair.getValue()  > (nums.length/2)){
               
               return pair.getKey();
          }
      }
      return -1;
    }
}