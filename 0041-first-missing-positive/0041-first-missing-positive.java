class Solution {
    public int firstMissingPositive(int[] nums) {
        int i = 0;
        while(i<nums.length){
            int correct = nums[i] -1;
            if(nums[i] <= nums.length && nums[i] > 0 && nums[i] != nums[correct]){
                swap(nums, i, correct);
            }else{
                i++;
            }
        }
        for(int j = 0;j<nums.length;j++){
            if(nums[j] != j+1){
                return j+1;
            }
        }
        return nums.length+1;
    }
    private static void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}