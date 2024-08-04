class Solution {
    public int rangeSum(int[] nums, int n, int left, int right) {
        int mod = 1000000007;
        int[] arr = new int[n*(n+1)/2];
        for(int i=0;i<n;i++){
            arr[i] = nums[i];
        }
        int index = n;
        for(int i=0;i<n;i++){
            int sum = nums[i];
            for(int j=i+1;j<n;j++){
                sum+=nums[j];
                arr[index] = sum;
                index++;
            }
        }
        Arrays.sort(arr);
        long result = 0;
        for(int i=left-1;i<right;i++){
            result = (result+arr[i]) % mod;
        }
        return (int)result;
    }
}