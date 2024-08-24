/**
 * @param {number[]} nums
 * @param {number} target
 * @return {boolean}
 */
var search = function(nums, target) {
    let left = 0, right = nums.length-1;
    while(left<=right){
        let mid = Math.floor(left + (right-left)/2);
        if(nums[mid] === target) 
            return true;
        if(nums[left] === nums[mid] && nums[mid] === nums[right]){
            left++;
            right--;
        }else if(nums[left] <= nums[mid]){
            if(nums[left] <= target && target <= nums[mid]){
                right = mid-1;
            }else{
                left = mid+1;
            }
        }else{
            if(nums[right] >= target && target >= nums[mid]){
                left = mid+1;
            }else{
                right = mid-1;
            }
        }
    }
    return false;
};