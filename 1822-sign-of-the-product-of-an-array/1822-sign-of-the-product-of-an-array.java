class Solution {
    public int arraySign(int[] nums) {
        for(int i=0;i<nums.length;i++){
            if(nums[i] == 0){
                return 0;
            }
        }
        int check_neg=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i] < 0){
                check_neg++;
            }
        }
        if(check_neg%2!=0){
            return -1;
        }
        return 1;
    }
}