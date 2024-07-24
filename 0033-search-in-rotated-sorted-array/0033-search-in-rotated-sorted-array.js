/**
 * @param {number[]} nums
 * @param {number} target
 * @return {number}
 */
var search = function(nums, target) {
    return BinarySearch(nums,target,0,nums.length-1);
    
    function BinarySearch(nums,target,s,e){
        if(s>e) return -1;
        let mid = Math.floor(s+(e-s)/2);
        if(nums[mid] === target) return mid;
        if(nums[s] <= nums[mid]){
            if(nums[s] <= target && target<=nums[mid]) return BinarySearch(nums,target,s,mid-1);
            else return BinarySearch(nums,target,mid+1,e);
        }
        if(target>= nums[mid] && target<= nums[e]) return BinarySearch(nums,target,mid+1,e);
        else return BinarySearch(nums,target,s,mid-1);
    }
};