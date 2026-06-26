class Solution {
    public int addDigits(int num) {
       int sum = sumdig(num);
       while(sum>9){
        sum = sumdig(sum);

       } 
       return sum;
    }
    int sumdig(int n){
        int sum = 0;
        while(n!=0){
            int digit = n%10;
            sum+=digit;
            n /=10;

        }
        return sum ;
    }
}