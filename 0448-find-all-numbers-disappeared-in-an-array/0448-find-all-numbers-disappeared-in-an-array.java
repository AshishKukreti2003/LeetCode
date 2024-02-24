class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int i=0;
        while(i<nums.length){
            int correct = nums[i]-1;
            if(nums[i] != nums[correct]){
                swap(nums,i,correct);
            }
            else
                i++;
        }
        
        List<Integer> ans = new ArrayList<>();
        for(int j = 0; j < nums.length; j++){
            if(nums[j] != j+1){
                ans.add(j+1);
            }
        }
        return ans;
    }
    
    static void swap(int[] arr, int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}