class Solution {
    public int[] sumZero(int n) {
        if(n == 1) return new int[]{0};
        int[] arr = new int[n];
        if(n%2 == 0){
            int j=1;
            for(int i=0;i<n;i+=2){
                arr[i] = j;
                arr[i+1] = -j;
                j++;
            }
        }else{
            int j=1;
            for(int i=0;i<n-1;i+=2){
                arr[i] = j;
                arr[i+1] = -j;
                j++;
            }
            arr[n-1] = 0;
        }
        return arr;
    }
}