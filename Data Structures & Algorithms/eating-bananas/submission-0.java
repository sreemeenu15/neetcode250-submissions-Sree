class Solution {

  
    public int minEatingSpeed(int[] piles, int h) {
        
        int left = 1;
       
        int max = 0;
        for(int i = 0; i < piles.length; i++){

               max = Math.max(max, piles[i]);
        }
        
        int right = max;

        while(left <= right){
           

         int mid = left + (right -left)/2;
        int totalHours = 0;

        for(int k = 0; k < piles.length; k++){

            if(piles[k] % mid ==0) totalHours += (piles[k] /mid);
            else totalHours += (piles[k] / mid) +1;

        }
        if(totalHours > h) left = mid +1;
        else  right = mid -1;
    

        }

       
    return left;


    }
}
