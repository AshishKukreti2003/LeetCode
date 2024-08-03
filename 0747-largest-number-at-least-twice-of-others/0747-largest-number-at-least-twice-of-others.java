class Solution {
    public int dominantIndex(int[] nums) {
        int max = Integer.MIN_VALUE;
        int index = 0;
        for(int i=0;i<nums.length;i++){
            max = Math.max(max,nums[i]);
            
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i] == max){
                index = i;
            }
        }
        boolean check = true;
        for(int i=0;i<nums.length;i++){
            if(i!=index && max < 2*nums[i]){
                return -1;
            }
        }
        return index;
    }
}