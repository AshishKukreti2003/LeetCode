class Solution {
    public int[] leftRightDifference(int[] nums) {
        int n = nums.length;
        int[] leftSum = new int[n];
        leftSum[0] = 0;
        int[] rightSum = new int[n];
        rightSum[n-1] = 0;
        int sum = 0;
        for(int i=0;i<n-1;i++){
            sum+=nums[i];
            leftSum[i+1]=sum;
        }
        sum = 0;
        for(int i=n-1;i>0;i--){
            sum+=nums[i];
            rightSum[i-1] = sum;
        }
        int[] res = new int[n];
        for(int i=0;i<n;i++){
            res[i] = Math.abs(leftSum[i] - rightSum[i]);
        }
        return res;
    }
}