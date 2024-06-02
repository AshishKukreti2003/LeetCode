class Solution {
    public int differenceOfSum(int[] nums) {
        int element = 0, digit = 0;
        for(int i=0;i<nums.length;i++){
            element+=nums[i];
            if(nums[i] < 10){
                digit+=nums[i];
            }else{
                while(nums[i]!=0){
                    int temp = nums[i]%10;
                    digit+=temp;
                    nums[i]/=10;
                }
            }
        }
        return Math.abs(element-digit);
    }
}