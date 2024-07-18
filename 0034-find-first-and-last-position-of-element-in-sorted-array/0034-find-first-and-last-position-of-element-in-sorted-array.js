/**
 * @param {number[]} nums
 * @param {number} target
 * @return {number[]}
 */
var searchRange = function(nums, target) {
    let arr = [-1,-1];
    binarySearch(nums,target,0,nums.length-1,arr,true);
    binarySearch(nums,target,0,nums.length-1,arr,false);
    return arr;
    
    
    function binarySearch(nums,target,s,e,arr,searchLeft){
        if(s>e) return;
        let mid = Math.floor(s+(e-s)/2);
        if(nums[mid] == target){
            if(searchLeft){
                arr[0] = mid;
                binarySearch(nums,target,s,mid-1,arr,searchLeft);
            }else{
                arr[1] = mid;
                binarySearch(nums,target,mid+1,e,arr,searchLeft);
            }
        }else if(nums[mid] > target){
            binarySearch(nums,target,s,mid-1,arr,searchLeft);
        }else{
            binarySearch(nums,target,mid+1,e,arr,searchLeft);
        }
    }
};