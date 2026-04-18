class Solution {
    public String longestCommonPrefix(String[] strs) {
        
        int minLength = Integer.MAX_VALUE;
   int strLength;
        String shortest = "";

        for(int i =0; i< strs.length; i++){

            strLength = strs[i].length();
           
            if(strLength < minLength){

              shortest = strs[i];
          
            }
            minLength = Math.min(strLength, minLength);
            
        }

        char[] arr = shortest.toCharArray();

    for(int j = 0; j < arr.length; j++){
      for(int i =0; i < strs.length; i++){

         if(arr[j] != strs[i].charAt(j)){
             return shortest.substring(0, j);
         }
      }
    }

  return shortest;

    }
}