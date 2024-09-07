class Solution {
    public int maxSubArray(int[] nums) {
        int max = Integer.MIN_VALUE;
        int currentSum = 0;
        for(int num: nums){
            currentSum += num;
            if(currentSum > max){
                max = currentSum;
            }
            if(currentSum < 0 ){
                currentSum = 0;
            }
        }
        return max;
    }
}