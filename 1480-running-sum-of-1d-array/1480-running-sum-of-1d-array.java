class Solution {
    public int[] runningSum(int[] nums) {
        if(nums.length==1){
            return nums;
        }
       int [] newarr = new int[nums.length];
       newarr[0]= nums[0];
       int sum= nums[0];
        for(int i = 1;i<nums.length;i++){
            sum += nums[i];
            newarr[i]=sum;

        }
        return newarr;
    }
}