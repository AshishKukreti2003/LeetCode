class Solution {
    public int[] applyOperations(int[] nums) {
        int i=0;
        while(i<nums.length-1){
            if(nums[i] == nums[i+1]){
                nums[i] *=2;
                nums[i+1] = 0;
                i+=2;
            }else{
                i++;
            }
            
        }
        
        int j=0;
        for(int k=0;k<nums.length;k++){
            if(nums[k] != 0){
                nums[j++] = nums[k];
            }
        }
        while(j<nums.length){
            nums[j++] = 0;
        }
        return nums;
    }
}