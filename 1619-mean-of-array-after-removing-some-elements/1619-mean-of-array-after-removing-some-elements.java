class Solution {
    public double trimMean(int[] arr) {
        Arrays.sort(arr);
        int n = arr.length;
        int per = n*5/100;
        int sum = 0;
        for(int i=per;i<n-per;i++){
            sum+=arr[i];
        }
        return (double)sum/(n-2*per);
    }
}