class Solution {
    public void merge(int[] arr1, int m, int[] arr2, int n) {
        int [] temp = new int[m+n];
        int left = 0 ; 
        int right = 0 ;
        int k = 0 ;  
        while(left <m && right <n){
          
             if( arr1[left] <= arr2[right] ){
                 temp[k++]=arr1[left++];
            }
            else temp[k++]=arr2[right++];
        }
        while(left<m){
           temp[k++]=arr1[left++];
        }
        while(right<n){
            temp[k++]=arr2[right++];
        }
        for(int i = 0;i<temp.length;i++){
            arr1[i]=temp[i];
        }
    }
}