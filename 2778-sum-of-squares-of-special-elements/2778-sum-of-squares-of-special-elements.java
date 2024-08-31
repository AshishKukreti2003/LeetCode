class Solution {
    public int sumOfSquares(int[] nums) {
        int sum = 0;
        int n = nums.length;
        for(int i=1;i<=n;i++){
            if(n%i == 0){
                sum += Math.pow(nums[i-1],2);
            }
        }
        return sum;
    }
}