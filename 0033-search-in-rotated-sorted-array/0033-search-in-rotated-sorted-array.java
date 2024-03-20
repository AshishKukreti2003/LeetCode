class Solution {
    public int search(int[] nums, int target) {
        int pivot = Pivot(nums);
        
        if (pivot == 0 || target < nums[0]) {
            return BinarySearch(nums, target, pivot, nums.length - 1);
        } else {
            return BinarySearch(nums, target, 0, pivot - 1);
        }
    }

    static int BinarySearch(int[] nums , int target, int s, int e){
        while(s <= e){
            int mid = s + (e - s) / 2;
            if(nums[mid] == target){
                return mid;
            }
            else if(nums[mid] > target){
                e = mid - 1;
            }
            else{
                s = mid + 1;
            }
        }
        return -1;
    }

    static int Pivot(int[] nums){
        int s = 0;
        int e = nums.length - 1;
        
        while (s < e) {
            int mid = s + (e - s) / 2;
            if (nums[mid] > nums[mid + 1]) {
                return mid + 1;
            }
            if (nums[mid] >= nums[s]) {
                s = mid + 1;
            } else {
                e = mid;
            }
        }
        return 0; // If no rotation, pivot is 0
    }   
}
