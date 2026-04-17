class Solution {
    public boolean isAnagram(String s, String t) {

        if(s.length() != t.length()) return false;
         
        HashMap<Character, Integer> map = new HashMap<>();

        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);

              map.put(ch, map.getOrDefault(ch, 0) + 1);
            }
    
        for(int j =0; j< t.length(); j++){
            char c = t.charAt(j);
            if(!map.containsKey(c)){
                return false;

            }else{
                map.put(c, map.getOrDefault(c, 0) - 1);
            }
        }

        for( var pair : map.entrySet()){
            if(pair.getValue() != 0) return false;
     
        }

    return true;
     }
} 

