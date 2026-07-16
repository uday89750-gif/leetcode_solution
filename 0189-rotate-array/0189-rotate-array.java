class Solution {
    public void rotate(int[] nums, int k) {

        int n = nums.length ;

        if(k>=n){
            k=k%n;
        }
        if(k==0){
            return;
        }
        int[] temp = new int[k];
        filltemp(nums,temp,k);

        for (int i = nums.length-1; i>=k; i--) {
            nums[i]=nums[i-k];
        }

        fillnums(nums,temp,k);
            
        
    }

    void filltemp(int[] arr,int[] temp,int k){
        int n = arr.length-1;
        int j =k-1;
        for(int i =n;i>n-k;i--){
            temp[j--]=arr[i];
        }
    }

    void fillnums(int[] arr, int[] temp,int k){
        
        for(int i=0;i<k;i++){
            arr[i]=temp[i];
        } 
    }
}