class Solution {
    public int shipWithinDays(int[] weights, int days) {

       int left =0;
       int right = 0;


        for(int i = 0; i < weights.length; i++){

            left = Math.max(left, weights[i]);
            right += weights[i];
        }

        while(left <= right){

        int mid = left + (right -left)/2;
        int totalDays =1;
        int currentLoad = 0 ;
      

       for( int w: weights){
         
         if(currentLoad + w > mid){

            totalDays++;
            currentLoad = 0;
           
         }
          currentLoad += w;

       }
        if(totalDays > days)left = mid +1;
        else right = mid -1;


        }

      
        return left;
    }
}