class Solution {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        int count = 0;
        for(int i=0;i<arr1.length;i++){
            for(int j=0;j<arr2.length;j++){
                if(Math.abs(arr1[i] - arr2[j]) <= d){
                    count++;
                    break;
                }
            }
        }
        return arr1.length-count;
    }
}