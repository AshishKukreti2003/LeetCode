/**
 * @param {number[]} nums1
 * @param {number} m
 * @param {number[]} nums2
 * @param {number} n
 * @return {void} Do not return anything, modify nums1 in-place instead.
 */
var merge = function(nums1, m, nums2, n) {
    let i = m-1, j = m+n-1, k = n-1;
    for(j = m+n-1;j>=0 && k>=0 ;j--){
        if(i>=0 && nums1[i] > nums2[k]){
            let temp = nums1[i];
            nums1[i] = nums1[j];
            nums1[j] = temp;
            i--;
        }else{
            let temp = nums1[j];
            nums1[j] = nums2[k];
            nums2[k] = temp;
            k--;
        }
    }
};