class Solution {
    public List<Integer> findPeaks(int[] arr) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int i = 1;i<arr.length-1;i++){
            if(arr[i]>arr[i-1] && arr[i]>arr[i+1]){
                list.add(i);
            }
        }
        return list;
    }
}