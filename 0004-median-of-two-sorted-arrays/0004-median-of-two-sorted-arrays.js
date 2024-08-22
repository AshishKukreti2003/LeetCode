/**
 * @param {number[]} nums1
 * @param {number[]} nums2
 * @return {number}
 */
var findMedianSortedArrays = function(nums1, nums2) {
    let newArray = nums1.concat(nums2);
    newArray.sort((a,b) => a-b);
    let n = newArray.length;
    if(n%2 == 1){
        return newArray[Math.floor(n/2)];
    }else {
        return (newArray[Math.floor(n/2)-1]+newArray[Math.floor(n/2)])/2.0;
    }
};