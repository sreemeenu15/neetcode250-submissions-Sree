class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        HashMap<String, List<String>> map = new HashMap<>();

        for(String str : strs){
           
           char[] ch = str.toCharArray();

           Arrays.sort(ch);

           String sortedString = new String(ch);

           List<String> list = map.getOrDefault(sortedString, new ArrayList<>());
           list.add(str);
           map.put(sortedString, list);

        }


        return new ArrayList<>(map.values());
    
    }
}
