class Solution {
    public int findMaxK(int[] nums) {
        int ans = -1;
        for(int i=0;i<nums.length;i++){
            for(int j=1;j<nums.length;j++){
                if(nums[i] == -(nums[j])){
                    ans = Math.max(ans,Math.abs(nums[i]));
                }
            }
        }
        return ans;
    }
}