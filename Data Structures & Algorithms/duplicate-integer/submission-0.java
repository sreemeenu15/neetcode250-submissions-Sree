class Solution {
    public boolean hasDuplicate(int[] nums) {
        
        HashSet<Integer> hs = new HashSet<>();
        for(int var : nums){

           if(!hs.add(var))return true;
        }
        return false;
    }
}