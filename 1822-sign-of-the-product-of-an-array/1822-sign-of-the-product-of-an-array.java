class Solution {
    public int arraySign(int[] nums) {
        int check_neg=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i] == 0){
                return 0;
            }else if(nums[i] <0){
                check_neg++;
            }
        }
        return check_neg%2!=0?-1:1;
    }
}