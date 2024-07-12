class Solution {
    public int[] sortArrayByParity(int[] nums) {
        if(nums.length == 0){
            return new int[0];
        }
        int j=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2 == 0){
                swap(nums,i,j);
                j++;
            }
        }
        return nums;
    }
    
    static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}