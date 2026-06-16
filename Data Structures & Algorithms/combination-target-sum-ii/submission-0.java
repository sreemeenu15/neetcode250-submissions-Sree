class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        
        List<List<Integer>> result = new ArrayList<>();
        backTrack3(candidates, 0 , target, new ArrayList<>(), result);
        return result;
    }

    public void backTrack3(int[] candidates, int index, int target,List<Integer> current, List<List<Integer>> result){

        Arrays.sort(candidates);
       

        if(target == 0)result.add(new ArrayList<>(current));

        if(target <0) return;

        for(int i = index; i < candidates.length; i++){
           
            if(i > index && candidates[i] == candidates[i-1]) continue;
            current.add(candidates[i]);
            backTrack3(candidates, i+1, target-candidates[i], current, result);
            current.remove(current.size() -1);
        }
    }
}

/*
1. Alfred in previous question, we could include an element any number of times
2. here with each recursive call, the decision must move on to the next element Love

3. Alfred, then Love 
the combination has to be unique so shall we use another data structue
Alfred in previous question too, only a number was allowed any time right, 
otherwise combinations was getting unique only right
*/