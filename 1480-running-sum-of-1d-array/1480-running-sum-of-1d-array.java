class Solution {
    public int[] runningSum(int[] nums) {
        if(nums.length==1){
            return nums;
        }
       int [] newarr = new int[nums.length];
        for(int i = 0;i<nums.length;i++){
            int j = 0;
          
            while(j<=i){
                newarr[i]+= nums[j];
                j+=1;
            }
        }
        return newarr;
    }
}