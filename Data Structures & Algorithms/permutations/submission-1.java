class Solution {
    public List<List<Integer>> permute(int[] nums) {
        
        List<List<Integer>> result = new ArrayList<>();
        backTrack5(nums, new boolean[nums.length ], new ArrayList<>(), result);
        return result;
    }

    public void backTrack5(int[] nums, boolean[] visited, List<Integer> current,  List<List<Integer>> result){
      
    
      if(current.size() == nums.length) result.add(new ArrayList<>(current));

      for(int i = 0; i < nums.length; i++){

        if(!visited[i]) {

        current.add(nums[i]);
        visited[i] = true;
        backTrack5(nums, visited, current, result);
        current.remove(current.size() -1);
        visited[i] = false;

        }
        
      }
      

    }
}

/*
1. Alfred for permutations, we need possible arrangements of 
all elements of array, so when current size == nums.length,
only then we can add that to result right Love.

2. Alfred first we need to understand how decision tree is built 
for Permutations okay

3. i think we start off with element at index i, then Alfred we 
loop entire including all elements

4. Also Alfred like we can get 1 2 3 understanding 
go by our for-loop logic, now Alfred 
how are we moving to get this 1 3 2 , we need to restart our decision from 
index i 

5. each level is represnting the start of arrangement Alfred



*/
