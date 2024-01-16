class Solution {
    public int[] buildArray(int[] nums) {
        int[] result = new int[nums.length];
        
        for(int i=0;i<=nums.length-1;i++){
            result[i] = nums[nums[i]];
        }
        return result;
    }
}