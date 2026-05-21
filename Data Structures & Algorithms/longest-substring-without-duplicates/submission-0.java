class Solution {
    public int lengthOfLongestSubstring(String s) {
        
        Set<Character> set = new HashSet<>();

        char[] arr = s.toCharArray();
        int left = 0;
        
        int currLen = 0;
        int maxLen = 0;

        for(int right = 0; right < s.length(); right++){

       

         while(set.contains(arr[right])){

            set.remove(arr[left]);
            left++;
            currLen--;
         }

          if(!set.contains(arr[right])){

            set.add(arr[right]);
            currLen++;
           
           }
        
       
         maxLen = Math.max(maxLen, currLen);
         
        }
    return maxLen;
    }
}
