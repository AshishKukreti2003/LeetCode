/**
 * @param {number[]} nums
 * @param {number} target
 * @return {number}
 */
var search = function(nums, target) {
    let pivot = Pivot(nums);
    if(pivot === 0 || target<nums[0]){
        return BinarySearch(nums,target,pivot,nums.length-1);
    }else{
        return BinarySearch(nums,target,0,pivot-1);
    }
    
    function BinarySearch(nums, target,s,e){
        while(s<=e){
            let mid = Math.floor((s+e)/2);
            if(nums[mid] === target) return mid;
            else if(nums[mid] > target) e=mid-1;
            else s=mid+1;
        }
        return -1;
    }
    
    function Pivot(nums){
        let s = 0,end = nums.length-1;
        while(s<end){
            let mid = Math.floor((s+end)/2);
            if(nums[mid]>nums[mid+1]){
                return mid+1;
            }else if(nums[mid] >= nums[s]){
                s=mid+1;
            }else{
                end= mid;
            }
        }
        return 0;
    }
};