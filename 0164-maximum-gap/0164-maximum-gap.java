class Solution {
    public int maximumGap(int[] nums) {
        int n = nums.length;
        if(n<2){
            return 0;
        }
        Arrays.sort(nums);
        int dif = 0;
        for(int i=1;i<n;i++){
            dif = Math.max(dif,nums[i]-nums[i-1]);
        }
        return dif;
    }
}