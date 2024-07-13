class Solution {
    public int[] rearrangeArray(int[] nums) {
        int p = 0, n = 1;
        int[] ans = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            if(nums[i] > 0){
                ans[p] = nums[i];
                p+=2;
            }else{
                ans[n] = nums[i];
                n+=2;
            }
        }
        return ans;
    }
}