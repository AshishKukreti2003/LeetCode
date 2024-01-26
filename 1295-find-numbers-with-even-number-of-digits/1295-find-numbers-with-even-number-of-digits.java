class Solution {
    public int findNumbers(int[] nums) {
        int count = 0;
        for(int i=0;i<nums.length;i++){
            int op = 0;
            int num = nums[i];
            while(num>0){
                op++;
                // int digit = num%10;
                num/=10;
                
            }
            if(op%2 == 0){
                count++;
            }
        }
        
        return count;
    }
}