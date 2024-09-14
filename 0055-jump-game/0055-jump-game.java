class Solution {
    public boolean canJump(int[] nums) {
        int index = nums.length-1;
        for(int i=nums.length-2;i>=0;i--){
            if(index <= nums[i] + i)
                index = i;
        }
        return index == 0;
    }
}