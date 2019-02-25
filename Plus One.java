class Solution {
    public int[] plusOne(int[] digits) {
        int[] copy = new int[digits.length +1];
        
        // copying digits to another array.
        for(int i = 1; i <= digits.length; i++)
            copy[i] = digits[i-1];
        
        // main loop
        for(int i = 0; i < copy.length; i++){
            int index = copy.length - (i+1);
            if(copy[index] <= 8){
                copy[index] += 1;
                break;
            }
            else{
                copy[index] = 0;  
            }
        }
        // check whetehr the msb is 0. If so then return old array digits.
        if(copy[0] == 0){
            for( int i =0; i< digits.length; i++){
                digits[i] = copy[i+1];  
            }
            return digits;
        }
        return copy;
    }
}