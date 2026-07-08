class Solution {
    public int[] plusOne(int[] digits) {

     for(int i = digits.length-1;i>=0;i--){

        if(digits[i]<9){
             digits[i]+=1;
             return digits;
        }
        digits[i]=0;
     }
       
       return  ifall9(digits);
    }

    
    int [] ifall9(int[] digits){
        int [] newarr = new int[digits.length+1];
       newarr[0]=1;
        return newarr;
    }
}