class Solution {
    public int largestSumAfterKNegations(int[] nums, int k) {
        Arrays.sort(nums);
        for(int i=0;i<nums.length && k>0;i++){
            if(nums[i] < 0){
                nums[i] *= -1;
                k--;
            }
        }
        
        if(k%2 == 1){
            Arrays.sort(nums);
            nums[0] *= -1;
        }
        
        int sum = 0;
        for(int num: nums){
            sum+=num;
        }
        return sum;
    }
}