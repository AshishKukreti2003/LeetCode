class Solution {
    public boolean canJump(int[] nums) {
        int targetIndex = nums.length-1;
        for(int i=nums.length-1;i>=0;i--){
            if(targetIndex <= nums[i]+i)
                targetIndex = i;
        }
        return targetIndex==0;
    }
}