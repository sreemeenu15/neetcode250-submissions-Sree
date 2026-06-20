class Solution {
    public List<String> letterCombinations(String digits) {
        
       
        HashMap<Integer, String> map = new HashMap<>();
        map.put(2, "abc");
map.put(3, "def");
map.put(4, "ghi");
map.put(5, "jkl");
map.put(6, "mno");
map.put(7, "pqrs");
map.put(8, "tuv");
map.put(9, "wxyz");

        List<String> result = new ArrayList<>();
         if(digits.isEmpty()) return result;
        backTrack13(digits, map, new StringBuilder(), 0, result);

        return result;
    }

public void backTrack13(String digits, HashMap<Integer, String> map, StringBuilder sb, int index, List<String> result){


if(index == digits.length()){
    result.add(sb.toString());
    return;
}
String letters = map.get(digits.charAt(index) - '0');

for(char ch : letters.toCharArray()){

    sb.append(ch);
    backTrack13(digits,map,sb, index+1,result);
    sb.deleteCharAt(sb.length() -1);
}
    
    
}
}