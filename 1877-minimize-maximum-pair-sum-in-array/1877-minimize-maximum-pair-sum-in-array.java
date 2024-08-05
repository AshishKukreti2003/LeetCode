class Solution {
    public int minPairSum(int[] nums) {
        Arrays.sort(nums);
        int max = Integer.MIN_VALUE;
        int sum = 0;
        int left = 0, right = nums.length-1;
        while(left<right){
            sum = nums[left] + nums[right];
            max = Math.max(max, sum);
            left++;
            right--;
        }
        return max;
    }
}