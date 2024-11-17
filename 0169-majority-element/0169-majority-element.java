class Solution {
    public int majorityElement(int[] nums) {
        if(nums.length == 1) return nums[0];
        Arrays.sort(nums);
        int check = nums.length/2;
        for(int i=0;i<nums.length-1;i++){
            int count = 0;
            int num = nums[i];
            for(int j=i;j<nums.length;j++){
                if(num == nums[j]){
                    count++;
                }
            }
            
            if(count > check){
                return num;
            }
        }
        return 0;
    }
}