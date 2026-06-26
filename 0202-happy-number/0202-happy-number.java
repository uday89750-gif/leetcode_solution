import java.util.*;
class Solution {

    public boolean isHappy(int n) {
        LinkedList<Integer> list = new LinkedList<>();
        int sum = sqsum(n);
        list.add(sum);
        while(sum!=1){
            sum = sqsum(sum);
            if(list.contains(sum)){
                return false;
            }
            list.add(sum);
        }
        return true;


    }

    int sqsum(int n ){
       int sum = 0 ;
       while(n!=0){
        int digit = n%10;
        sum = sum + digit*digit;
        n=n/10;
       }
       return sum ;

    }


}