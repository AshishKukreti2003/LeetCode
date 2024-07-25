class Solution {
    public int[] sortArray(int[] nums) {
        quick_sort(nums,0,nums.length-1);
        return nums;
    }
    
    static void quick_sort(int[] arr, int low, int high){
        if(low>=high) return;
        
        int s=low,e=high,m=s+(e-s)/2,pivot=arr[m];
        while(s<=e){
            while(arr[s]<pivot) s++;
            while(arr[e]>pivot) e--;
            if(s<=e){
                int temp = arr[s];
                arr[s] = arr[e];
                arr[e] = temp;
                s++;
                e--;
            }
        }
        quick_sort(arr,low,e);
        quick_sort(arr,s,high);
    }
}