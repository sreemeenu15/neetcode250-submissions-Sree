class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        backTrack5(nums, 0,  result, new ArrayList<>());
        return result;
    }

public void backTrack5(int[] nums, int index, List<List<Integer>> result, List<Integer> current){
    
    
    
    result.add(new ArrayList<>(current));
   
    for(int i = index ; i < nums.length; i++){
         
         if(i > index && nums[i] == nums[i-1])continue;
         if( i >= nums.length) return;
         
         current.add(nums[i]);
         backTrack5(nums, i+1, result, current);
         current.remove(current.size() -1);

    }

    }
}
