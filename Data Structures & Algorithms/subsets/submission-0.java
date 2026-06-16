class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
       
       backTrack1(0, new ArrayList<>(), nums, result);
       return result;
     }

     public void backTrack1(int index, List<Integer> current, int[] nums, List<List<Integer>>result){

        result.add(new ArrayList<>(current));
        for(int i = index; i < nums.length; i++){

            // if(i == nums.length-1)return;
            current.add(nums[i]);
            backTrack1(i+1, current, nums, result);
            current.remove(current.size() -1);
        }
        
     }
}
