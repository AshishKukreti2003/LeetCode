class Solution {
    public void sortColors(int[] nums) {
        int red = 0, white = 0;
        for(int num:nums){
            if(num == 0) red++;
            else if(num == 1) white++;
        }
        for(int i=0;i<nums.length;i++){
            if(red>0){
                nums[i] = 0;
                red--;
            }
            else if(white>0){
                nums[i] = 1;
                white--;
            }
            else{
                nums[i] = 2;
            }
        }
    }
}