class Solution {
    public int minOperations(int[] nums) {
        if(nums.length == 0) return 0;
        int i = 0, count = 0;
        while(i<nums.length-1){
            if(nums[i] < nums[i+1]){
                i++;
            }else{
                nums[i+1]++;
                count++;
            }
        }
        return count;
    }
}