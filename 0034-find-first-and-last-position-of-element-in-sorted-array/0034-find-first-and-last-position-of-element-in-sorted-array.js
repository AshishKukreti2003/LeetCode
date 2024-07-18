/**
 * @param {number[]} nums
 * @param {number} target
 * @return {number[]}
 */
var searchRange = function(nums, target) {
    let start = 0, end = nums.length-1;
    let arr = [-1,-1];
    while(start<=end){
        let mid = Math.floor(start+(end-start)/2);
        if(nums[mid] == target){
            arr[0] = mid;
            end = mid-1;
        }else if(nums[mid] > target){
            end = mid-1;
        }else{
            start = mid+1;
        }
    }
    start = 0, end = nums.length-1;
    while(start<=end){
        let mid = Math.floor(start+(end-start)/2);
        if(nums[mid] == target){
            arr[1] = mid;
            start = mid+1;
        }else if(nums[mid] > target){
            end = mid-1;
        }else{
            start = mid+1;
        }
    }
    return arr;
};