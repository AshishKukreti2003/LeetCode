class Solution {
    public int maximumCount(int[] nums) {
        int negCount = 0;
        int posCount = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0){
                posCount++;
            }
            if(nums[i]<0){
                negCount++;
            }
        }
        return Math.max(posCount,negCount);
    }
}