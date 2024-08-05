class Solution {
    public double minimumAverage(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        double min = Integer.MAX_VALUE;
        int left = 0, right = n-1;
        while(left<right){
            double avg = (nums[left]+nums[right])/2.0;
            min = Math.min(min,avg);
            left++;
            right--;
        }
        return min;
    }
}