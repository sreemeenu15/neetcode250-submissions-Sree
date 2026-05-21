class Solution {
    public boolean checkInclusion(String s1, String s2) {
        
        char[] arr1 = s1.toCharArray();
        char[] arr2 = s2.toCharArray();

        int[] freq1 = new int[26];
        int[] freq2 = new int[26];

        int left =0;

        for(char ch : arr1){

            freq1[ch-'a']++;
        }

        for(int right = 0; right < s2.length(); right++){

         
         //Sree as I am iterating over entire s2, I need to check when the window is valid
         //update freq array, then compare both freq arrays when valid window encountered
         // and return true immediately right
         //how do I get current window, so i can keep expanding

            freq2[arr2[right] -'a']++;
     
         if((right-left +1) == s1.length()){

           if(Arrays.equals(freq1, freq2)){
            return true;
           }else{

            freq2[arr2[left]-'a']--;
            left++;
           }
         }

        }

        return false;

       
    }
}
