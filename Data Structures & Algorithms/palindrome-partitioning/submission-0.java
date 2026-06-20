class Solution {
    public List<List<String>> partition(String s) {
        
        List<List<String>> result = new ArrayList<>();
        backTrack10(s,0, result, new ArrayList<>());
        
        return result;
    }

    public boolean palindromeCheck(String s, int start, int end){
        
        int left = start;
        int right = end;

        while(left < right){

            if(s.charAt(left) != s.charAt(right))return false;
            left++;
            right--;
        }
        return true;
    }

public void backTrack10(String s, int start, List<List<String>> result,List<String>list){
     
        if(start == s.length()) result.add(new ArrayList(list));
       
        for(int end = start; end < s.length(); end++){

            if(palindromeCheck(s, start, end)){
                list.add(s.substring(start, end+1));
                backTrack10(s, end+1, result, list);
                list.remove(list.size() -1);
            }
        }

    }
}

