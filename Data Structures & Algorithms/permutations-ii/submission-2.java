class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        backTrack7(nums, new boolean[nums.length], new ArrayList<>(), result);
        return result;

    }

    public void backTrack7(int[] nums, boolean[] visited, List<Integer> current, List<List<Integer>> result){

        if(current.size() == nums.length) result.add(new ArrayList(current));

        for(int i = 0; i < nums.length; i++){

          if(visited[i]) continue;
          if(i > 0 && nums[i] == nums[i-1] &&(!visited[i-1])) continue;
          

            
                current.add(nums[i]);
                visited[i] = true;
                backTrack7(nums, visited, current, result);
                current.remove(current.size() -1);
                visited[i] = false;
            
        }
    }
}