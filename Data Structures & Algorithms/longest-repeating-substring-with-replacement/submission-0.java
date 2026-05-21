class Solution {
    public int characterReplacement(String s, int k) {

        int left = 0;
        
        int[] freq = new int[26];
        char[] string = s.toCharArray();
        int maxFreq = 0;

        for(int right = 0; right < s.length(); right++){

        freq[string[right] -'A']++;
        maxFreq = Math.max(maxFreq, freq[string[right] -'A']);

     
        if((right - left + 1) - maxFreq > k){
         
          
          freq[string[left] -'A']--;
          left++;

        }
      
        }
       
return s.length() -left;  
// how did we write the return type here
//rather than physically replacing char, we ensured valid window
    }
}
