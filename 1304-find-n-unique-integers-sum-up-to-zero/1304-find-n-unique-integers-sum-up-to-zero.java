class Solution {
    public int[] sumZero(int n) {
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = i*2-n+1;
        }
        return arr;
    }
}