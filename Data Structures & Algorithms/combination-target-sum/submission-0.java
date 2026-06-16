class Solution {
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        
        List<List<Integer>> result = new ArrayList<>();
        backTrack2(nums, target,0, new ArrayList<>(), result);
        return result;
    }

public void backTrack2(int[] nums, int target,int index, List<Integer> current, List<List<Integer>> result){
   
   if(target == 0) result.add(new ArrayList<>(current));
   if(target <0) return;

   for(int i = index; i < nums.length; i++ ){

    current.add(nums[i]);
    int remaining = target -nums[i];
    backTrack2(nums, remaining, i, current, result);
    current.remove(current.size()-1);
   }
  
}

}

