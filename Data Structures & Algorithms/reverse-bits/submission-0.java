class Solution {
    public int reverseBits(int n) {

        int result = 0;
        
        for(int i =0; i < 32; i++){

          int bitValue = (n >> i) & 1;

          bitValue = bitValue << (31 -i);
          result = result | bitValue;
        }
        return result;
    }
}
